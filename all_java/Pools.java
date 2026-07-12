package androidx.core.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t);
    }

    private Pools() {
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i2];
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i2 = this.mPoolSize;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.mPoolSize = i2 - 1;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T t) {
            if (isInPool(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i2 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.mPoolSize = i2 + 1;
            return true;
        }

        private boolean isInPool(T t) {
            for (int i2 = 0; i2 < this.mPoolSize; i2++) {
                if (this.mPool[i2] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int i2) {
            super(i2);
            this.mLock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T t) {
            boolean zRelease;
            synchronized (this.mLock) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }
}
