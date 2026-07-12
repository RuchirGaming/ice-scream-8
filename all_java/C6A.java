package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6A, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C6A {
    public static byte[] A06;
    public int A00;
    public long A01;
    public long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-83, -112};
    }

    public final synchronized String toString() {
        return this.A05 + A00(1, 1, 70) + this.A04 + this.A03 + A00(0, 1, 113) + this.A00 + A00(0, 1, 113) + this.A01 + A00(0, 1, 113) + this.A02;
    }
}
