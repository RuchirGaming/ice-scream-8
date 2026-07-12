package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum AnonymousClass77 {
    A09,
    A07,
    A08,
    A06,
    A05,
    A03,
    A04,
    A0B,
    A02,
    A0A;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{110, 121, 121, -79, -66, -66, -69, -76, -80, -67, 96, 101, 94, 111, -68, -57, -51, -70, -60, -67, -81, -75, -72, -86, -67, -111, -106, -100, -74, -71, -72, -79, -31, -24, -33, -33, -108, -106, -115, -111, -115, -104, -115, -102, -119, -46, -45, -47, -56, -51, -58};
    }

    static {
        A01();
    }
}
