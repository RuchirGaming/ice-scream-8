package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final el f30492a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final el f30493b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final el f30494c = new b(1);

    private static final class b extends el {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f30495d;

        b(int i2) {
            super(0);
            this.f30495d = i2;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(int i2, int i3) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(long j2, long j3) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final <T> el a(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el b(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final int d() {
            return this.f30495d;
        }
    }

    /* synthetic */ el(int i2) {
        this();
    }

    public static el e() {
        return f30492a;
    }

    public abstract el a(int i2, int i3);

    public abstract el a(long j2, long j3);

    public abstract <T> el a(T t, T t2, Comparator<T> comparator);

    public abstract el a(boolean z, boolean z2);

    public abstract el b(boolean z, boolean z2);

    public abstract int d();

    final class a extends el {
        a() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final <T> el a(T t, T t2, Comparator<T> comparator) {
            int iCompare = comparator.compare(t, t2);
            if (iCompare < 0) {
                return el.f30493b;
            }
            return iCompare > 0 ? el.f30494c : el.f30492a;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el b(boolean z, boolean z2) {
            byte b2;
            if (z2 == z) {
                b2 = 0;
            } else {
                b2 = z2 ? (byte) 1 : (byte) -1;
            }
            if (b2 < 0) {
                return el.f30493b;
            }
            return b2 > 0 ? el.f30494c : el.f30492a;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final int d() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(int i2, int i3) {
            byte b2;
            if (i2 < i3) {
                b2 = -1;
            } else {
                b2 = i2 > i3 ? (byte) 1 : (byte) 0;
            }
            if (b2 < 0) {
                return el.f30493b;
            }
            return b2 > 0 ? el.f30494c : el.f30492a;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(long j2, long j3) {
            byte b2;
            if (j2 < j3) {
                b2 = -1;
            } else {
                b2 = j2 > j3 ? (byte) 1 : (byte) 0;
            }
            if (b2 < 0) {
                return el.f30493b;
            }
            return b2 > 0 ? el.f30494c : el.f30492a;
        }

        @Override // com.yandex.mobile.ads.impl.el
        public final el a(boolean z, boolean z2) {
            byte b2;
            if (z == z2) {
                b2 = 0;
            } else {
                b2 = z ? (byte) 1 : (byte) -1;
            }
            if (b2 < 0) {
                return el.f30493b;
            }
            return b2 > 0 ? el.f30494c : el.f30492a;
        }
    }

    private el() {
    }
}
