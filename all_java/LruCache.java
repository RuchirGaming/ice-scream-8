package androidx.collection;

import com.ironsource.sdk.constants.a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    protected V create(K k2) {
        return null;
    }

    protected void entryRemoved(boolean z, K k2, V v, V v2) {
    }

    protected int sizeOf(K k2, V v) {
        return 1;
    }

    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i2;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public void resize(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i2;
        }
        trimToSize(i2);
    }

    public final V get(K k2) {
        V vPut;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v = this.map.get(k2);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V vCreate = create(k2);
            if (vCreate == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                vPut = this.map.put(k2, vCreate);
                if (vPut != null) {
                    this.map.put(k2, vPut);
                } else {
                    this.size += safeSizeOf(k2, vCreate);
                }
            }
            if (vPut != null) {
                entryRemoved(false, k2, vCreate, vPut);
                return vPut;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final V put(K k2, V v) {
        V vPut;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k2, v);
            vPut = this.map.put(k2, v);
            if (vPut != null) {
                this.size -= safeSizeOf(k2, vPut);
            }
        }
        if (vPut != null) {
            entryRemoved(false, k2, vPut, v);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public void trimToSize(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    break;
                }
                if (this.size > i2 && !this.map.isEmpty()) {
                    Map.Entry<K, V> next = this.map.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.map.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                }
                return;
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final V remove(K k2) {
        V vRemove;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            vRemove = this.map.remove(k2);
            if (vRemove != null) {
                this.size -= safeSizeOf(k2, vRemove);
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k2, vRemove, null);
        }
        return vRemove;
    }

    private int safeSizeOf(K k2, V v) {
        int iSizeOf = sizeOf(k2, v);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + k2 + a.i.f17746b + v);
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.hitCount;
        i3 = this.missCount + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
