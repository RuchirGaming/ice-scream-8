package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC07928i {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 57, 40, Utf8.REPLACEMENT_BYTE, 52, 57, 56, 35, 46, 57, Utf8.REPLACEMENT_BYTE, 51, 46, 56, 47, 67, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 77, 90, 71, 80, 67, 67, SignedBytes.MAX_POWER_OF_TWO, 87, 90, 81, 74, 74, 90, 86, 72, 68, 73, 73, 77, 76, 92, 81, 70, SignedBytes.MAX_POWER_OF_TWO, 76, 81, 71, 80, 92, 87, 76, 92, 69, 70, 87, SignedBytes.MAX_POWER_OF_TWO, 75};
    }

    static {
        A01();
    }
}
