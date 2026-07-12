package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1220Pw {
    A05,
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"7GN8MrenydislHWBBPReIB", "P5", "QDtKUFo4Pv7jZ7qumv108KMzWf6HrSMn", "iim9AI0VqZedzbhMlrV0qDo4YMl61NlV", "LtGcJkDv8PpKzGxu4pknm0pyAahoAI9h", "Z7tecEc8tS2JrzNmQM0R9CjEnjCb6ksC", "JuvL09EyJViLP4nPFPxPBzJM00GhcqAu", "kQTCJlS50BSCbahTVqCDmy8LW1L9RVvG"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{66, 69, SignedBytes.MAX_POWER_OF_TWO, 65, 91, 75, 81, 80, 91, 75, 74, 91, 84, 72, 69, 93, 101, 98, 122, 127, 101, 110, 96, 105, 5, 26, 0, 26, 17, 31, 22};
    }

    static {
        A01();
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1220Pw[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        String[] strArr = A01;
        if (strArr[1].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[3] = "fXviZ9AMoZT5h2KBZwjslTMVyIobOTux";
        return (EnumC1220Pw[]) objClone;
    }
}
