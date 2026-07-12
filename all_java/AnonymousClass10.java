package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.10, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum AnonymousClass10 {
    A03(A00(13, 3, 1)),
    A05(A00(22, 4, 3)),
    A04(A00(16, 6, 82));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, -119, -119, -38, -50, -37, -30, -50, -39, -71, -70, -71, -80, -105, -94, -94, -12, -24, -11, -4, -24, -13, -90, -89, -90, -99};
    }

    static {
        A01();
    }

    AnonymousClass10(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
