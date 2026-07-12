package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8H, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum C8H {
    A05,
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"PRV2czZbjjW7Ot8uaJuxnRGNdIXO90ph", "gwx3lgvxFr5Ur4U2", "dsOpW9WfLYJghusiq4Ru5jQxxgYMnVUV", "Pl2vgN3HXqbbKxjZzIk4bg0eix12xhJu", "GcMaFESaYtqWHDueobHkP3OuSFimx", "24r37uIww3uTwRKO2qndV6iCHFSPOn3z", "z2MMJP2kfG1jeTB65BQHm0", "ohb3NNZFp"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] - i4;
            if (A01[3].charAt(9) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "qn8tosrMnBeOYh3nA69X7hpHPvfrKSD7";
            strArr[0] = "8KW7HxISbWo03NIKRfZKM6CMMG4fzKY9";
            bArrCopyOfRange[i5] = (byte) (i6 - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{18, 27, 24, 18, 26, -57, -53, -50, -48, -61, -47, -47, -57, -51, -52, -70, -83, -71, -67, -83, -69, -68};
    }

    static {
        A01();
    }
}
