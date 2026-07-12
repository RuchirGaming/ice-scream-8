package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum IZ {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{39, 54, 34, 36, 50, 51, 46, 50, Utf8.REPLACEMENT_BYTE, 39, 55, 48, 57};
    }

    static {
        A01();
    }
}
