package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum LJ {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-85, -83, -96, -89, -86, -93, -67, -112, -91, -36, -34, -47, -40, -37, -44, -18, -62, -42, -45, -43, -56, -49, -46, -53, -27, -70, -51, -26, -24, -37, -30, -27, -34, -8, -30, -25, -19, -34, -21, -25, -34, -19, -90, -89, -90, -99, -34, -41, -44, -41, -40, -32, -41};
    }

    static {
        A01();
    }

    LJ(int i2) {
        this.A00 = i2;
    }
}
