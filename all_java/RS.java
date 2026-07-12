package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum RS {
    A03(A00(10, 4, 24)),
    A04(A00(14, 6, 108));

    public static byte[] A01;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -19, -16, -16, -70, -75, -87, -90, -71, -86, -35, -32, -29, -29, SignedBytes.MAX_POWER_OF_TWO, 59, 47, 44, Utf8.REPLACEMENT_BYTE, 48};
    }

    static {
        A01();
    }

    RS(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
