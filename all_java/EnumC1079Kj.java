package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1079Kj {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-68, -63, -68, -57, -68, -76, -65, -68, -51, -72, -73, -13, -8, -13, -2, -13, -21, -10, -13, 4, -13, -8, -15, 24, 25, 30, 41, 19, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    static {
        A01();
    }
}
