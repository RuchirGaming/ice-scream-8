package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1074Ke {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-79, -83, 121, -80, 125, -80, 121, -36, -40, -92, -24, -21, -28, -28, -33, -28, -35, -43, -37, -88, -37, -15, -17, -14, -30};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        if (!A04()) {
            return null;
        }
        return System.getProperty(A00(0, 7, 50) + str);
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        if (!A00) {
            A01 = A00(21, 4, 100).equals(System.getProperty(A00(7, 14, 93)));
            A00 = true;
        }
        return A01;
    }

    public static synchronized boolean A05(String str) {
        return !TextUtils.isEmpty(A01(str));
    }
}
