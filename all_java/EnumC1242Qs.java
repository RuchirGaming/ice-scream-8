package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1242Qs {
    A05(true, false),
    A06(true, true);

    public static byte[] A02;
    public static String[] A03 = {"O", "EV50HHvcjD7YLIyebT4WEIV5yebebm0n", "F", "5eKOX", "rITyk", "abzOrFl3CNxf2rC8XtUXLAElYVzjlriN", "oaymDZ7pAEcbNFhv7Y0pKv8En2RbSAw", "1P4e8Svw6pgZkfS1AU7Ku11MIWhAZ0aY"};
    public boolean A00;
    public boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 69);
            if (A03[6].length() != 31) {
                throw new RuntimeException();
            }
            A03[1] = "x5tPmx47tzICoGkmwmxxU8TFYjneGYu3";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{4, 2, 17, -56, -57, -53, -52};
    }

    static {
        A01();
    }

    EnumC1242Qs(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String A02() {
        return toString();
    }

    public final boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }
}
