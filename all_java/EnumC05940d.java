package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC05940d {
    A0C(A00(169, 5, 108)),
    A0A(A00(156, 5, 19)),
    A03(A00(87, 8, 102)),
    A0B(A00(161, 8, 112)),
    A07(A00(128, 10, 80)),
    A09(A00(147, 9, 122)),
    A08(A00(138, 9, 102)),
    A04(A00(95, 7, 74)),
    A05(A00(102, 13, 13)),
    A06(A00(115, 13, 27));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 17, 2, 31, 5, 3, 21, 28, 16, 27, 18, 26, 29, 22, 23, 115, 120, 113, 121, 126, 117, 116, 111, 121, 125, 113, 119, 117, 17, 26, 19, 27, 28, 23, 22, 13, 4, 27, 22, 23, 29, 104, 127, 96, 115, 100, 117, 110, 126, 101, 104, 90, 77, 82, 65, 87, 83, 95, 89, 91, 78, 89, 70, 85, 92, 67, 78, 79, 69, 109, 105, 101, 99, 97, 9, 21, 24, 0, 24, 27, 21, 28, 92, 67, 78, 79, 69, 55, 53, 38, 59, 33, 39, 49, 56, 27, 16, 25, 17, 22, 29, 28, 92, 87, 94, 86, 81, 90, 91, 96, 86, 82, 94, 88, 90, 74, 65, 72, SignedBytes.MAX_POWER_OF_TWO, 71, 76, 77, 118, 95, SignedBytes.MAX_POWER_OF_TWO, 77, 76, 70, 6, 17, 14, Base64.padSymbol, 10, 27, 0, 16, 11, 6, 48, 39, 56, 11, Base64.padSymbol, 57, 53, 51, 49, 44, 59, 36, 23, 62, 33, 44, 45, 39, 72, 76, SignedBytes.MAX_POWER_OF_TWO, 70, 68, 50, 46, 35, 59, 35, 32, 46, 39, 40, 55, 58, 59, 49};
    }

    static {
        A01();
    }

    EnumC05940d(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
