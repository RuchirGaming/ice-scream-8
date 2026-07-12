package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C06472f {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i2) {
        return A01(i2 * 8) / 8;
    }

    public static int A01(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = 1 << i3;
            if (i2 <= i4 - 12) {
                int i5 = (1 << i3) - 12;
                return i5;
            }
        }
        return i2;
    }

    public static int A02(int[] iArr, int i2, int i3) {
        int midVal = 0;
        int mid = i2 - 1;
        while (midVal <= mid) {
            int lo = midVal + mid;
            int hi = lo >>> 1;
            int lo2 = iArr[hi];
            if (lo2 < i3) {
                midVal = hi + 1;
            } else if (lo2 > i3) {
                mid = hi - 1;
            } else {
                return hi;
            }
        }
        int lo3 = midVal ^ (-1);
        return lo3;
    }

    public static int A03(long[] jArr, int i2, long j2) {
        int i3 = 0;
        int i4 = i2 - 1;
        while (i3 <= i4) {
            int lo = i3 + i4;
            int i5 = lo >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i3 = i5 + 1;
            } else if (j3 > j2) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        int lo2 = i3 ^ (-1);
        return lo2;
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
