package com.applovin.exoplayer2.common.a;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class ah {
    public static <T> T[] c(T[] tArr, int i2) {
        return (T[]) aj.c(tArr, i2);
    }

    static Object[] f(Object... objArr) {
        return d(objArr, objArr.length);
    }

    static Object[] d(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            b(objArr[i3], i3);
        }
        return objArr;
    }

    static Object b(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i2);
    }
}
