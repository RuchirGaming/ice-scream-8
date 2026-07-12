package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1028Ih {
    A05(0),
    A04(1);

    public static byte[] A01;
    public static String[] A02 = {"oiwcgQDD2Kh2jNi2Ca2cNMgwHOvPe1SO", "yCbh3JWABSPWXJzi8IqNfGSw4JUwRc1Z", "TDKikcySDZ1IILIigFVmatsXCwa", "mxQFgn0FH0MMkOxHpkkDQyVpPhA2Zhda", "dru3glT9ekJ0g4QSSusKvICYyzfTBGaa", "dAZiojPQaZCECwqg1LvdEmP9Ue6", "ejQSO991EpDhDVu4zMofsruN7P1", "5bejy9B"};
    public final int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 117;
            String[] strArr = A02;
            if (strArr[0].charAt(4) != strArr[4].charAt(4)) {
                throw new RuntimeException();
            }
            A02[3] = "h3cU3OwhzzGY5RqiQjzUPbB5XZb13N8z";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -61, -60, -61, -48, -48, -61, -62, -7, -3, -3, -11, -12, -7, -15, 4, -11};
    }

    static {
        A01();
    }

    EnumC1028Ih(int i2) {
        this.A00 = i2;
    }
}
