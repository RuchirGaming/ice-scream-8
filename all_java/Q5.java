package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum Q5 {
    A04,
    A03,
    A06,
    A05;

    public static byte[] A00;
    public static String[] A01 = {"DteKWBudESjDtqSUyoTC5E", "I5FSM6v9D3qkRXnarws6dVsmQqtQoJdF", "2aIeIMdS22Kqsjw8nHnHH5KV6oj1373E", "g", "GOJ9oRRABJfcwjAA770tm42MgykplS5Q", "ccCRkU4tJU1cPhlyS12s2rOBaxNg0sA2", "PEuaDw0tTVC0zIT2D0mW6", "B"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {41, 38, 33, 37, 41, 60, 45, 44, 85, 90, 93, 89, 85, SignedBytes.MAX_POWER_OF_TWO, 93, 90, 83, 70, 81, 66, 81, 70, 71, 81, 75, 85, 90, 93, 89, 85, SignedBytes.MAX_POWER_OF_TWO, 81, 80, 81, 70, 85, 70, 81, 80, 70, 92, 66, 77, 74, 78, 66, 87, 74, 77, 68};
        String[] strArr = A01;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Z";
        strArr2[7] = "Z";
        A00 = bArr;
    }

    static {
        A01();
    }
}
