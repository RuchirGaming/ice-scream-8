package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum J9 {
    A03,
    A05,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, 22, 21};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(J9 j9) {
        if (j9 == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (J8.A00[j9.ordinal()]) {
            case 1:
                return VideoAutoplayBehavior.DEFAULT;
            case 2:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.ON;
                String[] strArr = A01;
                if (strArr[0].charAt(5) == strArr[4].charAt(5)) {
                    A01[2] = "D4DDJWMfk";
                    return videoAutoplayBehavior;
                }
                String[] strArr2 = A01;
                strArr2[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
                strArr2[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
                return videoAutoplayBehavior;
            case 3:
                return VideoAutoplayBehavior.OFF;
            default:
                VideoAutoplayBehavior videoAutoplayBehavior2 = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(9) == 'M') {
                    throw new RuntimeException();
                }
                A01[5] = "KWBYg9gUO";
                return videoAutoplayBehavior2;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static J9[] valuesCustom() {
        J9[] j9ArrValuesCustom = values();
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "qrA";
        strArr[3] = "mB";
        return (J9[]) j9ArrValuesCustom.clone();
    }
}
