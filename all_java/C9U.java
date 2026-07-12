package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9U, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C9U {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-15, -7, -7, -15, -72, -17, 2, -7, -72, -19, -7, -4, -17};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 88);
    }

    public static synchronized String A00() {
        return A00;
    }
}
