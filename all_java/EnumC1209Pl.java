package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1209Pl {
    A04(A00(147, 33, 28)),
    A05(A00(180, 36, 56)),
    A06(A00(216, 29, 15)),
    A03(A00(78, 32, 93)),
    A07(A00(110, 37, 32));

    public static byte[] A01;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{79, SignedBytes.MAX_POWER_OF_TWO, 85, 72, 87, 68, 94, SignedBytes.MAX_POWER_OF_TWO, 69, 94, 66, 77, 72, 66, 74, 45, 34, 55, 42, 53, 38, 60, 32, 44, 46, 51, 47, 38, 55, 38, 113, 126, 107, 118, 105, 122, 96, 122, 113, 123, 96, 126, 124, 107, 118, 105, 118, 107, 102, 60, 51, 38, 59, 36, 55, 45, 55, 32, 32, Base64.padSymbol, 32, 121, 118, 99, 126, 97, 114, 104, 126, 122, 103, 101, 114, 100, 100, 126, 120, 121, 121, 117, 119, 52, 124, 123, 121, 127, 120, 117, 117, 113, 52, 123, 126, 105, 52, 116, 123, 110, 115, 108, 127, 52, 123, 126, 69, 121, 118, 115, 121, 113, 4, 8, 10, 73, 1, 6, 4, 2, 5, 8, 8, 12, 73, 6, 3, 20, 73, 9, 6, 19, 14, 17, 2, 73, 6, 3, 56, 14, 10, 23, 21, 2, 20, 20, 14, 8, 9, 56, 52, 54, 117, Base64.padSymbol, 58, 56, 62, 57, 52, 52, 48, 117, 58, Utf8.REPLACEMENT_BYTE, 40, 117, 53, 58, 47, 50, 45, 62, 117, 56, 52, 54, 43, 55, 62, 47, 62, Utf8.REPLACEMENT_BYTE, 28, 16, 18, 81, 25, 30, 28, 26, 29, 16, 16, 20, 81, 30, 27, 12, 81, 17, 30, 11, 22, 9, 26, 81, 26, 17, 27, 32, 30, 28, 11, 22, 9, 22, 11, 6, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 38, 41, 60, 33, 62, 45, 102, 45, 58, 58, 39, 58};
    }

    static {
        A01();
    }

    EnumC1209Pl(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
