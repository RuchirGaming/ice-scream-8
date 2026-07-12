package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class BB extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{47, 7, 6, 11, 3, 66, 6, 13, 7, 17, 66, 12, 13, 22, 66, 17, 23, 18, 18, 13, 16, 22, 66, 23, 23, 11, 6, 88, 66};
    }

    public BB(UUID uuid) {
        super(A00(0, 29, 29) + uuid);
    }
}
