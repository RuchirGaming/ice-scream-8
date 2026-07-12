package com.facebook.ads.redexgen.X;

import com.amazon.device.ads.DtbConstants;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum JJ implements Serializable {
    A04(DtbConstants.DEFAULT_PLAYER_WIDTH, 50),
    A07(0, 0),
    A05(-1, 50),
    A06(-1, 90),
    A08(-1, 250);

    public static byte[] A02 = null;
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-31, -32, -19, -19, -28, -15, -2, -46, -47, -49, -2, -44, -49, -54, -55, -42, -42, -51, -38, -25, -48, -51, -47, -49, -48, -36, -25, -67, -72, -78, -79, -66, -66, -75, -62, -49, -72, -75, -71, -73, -72, -60, -49, -87, -96, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -94, -107, -109, -92, -111, -98, -105, -100, -107, -81, -104, -107, -103, -105, -104, -92, -81, -126, -123, -128};
    }

    static {
        A01();
    }

    JJ(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }
}
