package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC05990i {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{37, 34, Utf8.REPLACEMENT_BYTE, 56, 45, 32, 32, 41, 40, 37, 36, 37, 46, 101, 100, 127, 116, 98, 101, 120, 127, 106, 103, 103, 110, 111};
    }

    static {
        A02();
    }

    public static EnumC05990i A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
