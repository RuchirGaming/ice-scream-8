package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class HD {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 93, 74, 122, 73, SignedBytes.MAX_POWER_OF_TWO, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(HC hc) {
        return hc.A5l(A02(0, 7, 70), -1L);
    }

    public static Uri A01(HC hc) {
        String strA5n = hc.A5n(A02(7, 9, 12), null);
        if (strA5n == null) {
            return null;
        }
        return Uri.parse(strA5n);
    }

    public static void A04(HE he) {
        he.A01(A02(7, 9, 12));
    }

    public static void A05(HE he, long j2) {
        he.A02(A02(0, 7, 70), j2);
    }

    public static void A06(HE he, Uri uri) {
        he.A03(A02(7, 9, 12), uri.toString());
    }
}
