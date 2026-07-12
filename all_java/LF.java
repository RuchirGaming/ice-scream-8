package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class LF {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String str) {
        if (str != null) {
            String truncatedBody = A00(0, 1, 88);
            StringTokenizer stringTokenizer = new StringTokenizer(str, truncatedBody, true);
            int i2 = 0;
            int maxLength = str.length();
            if (maxLength > 90) {
                int tokenLength = str.length();
                String strA00 = A00(1, 3, 14);
                if (tokenLength > 93 || !str.endsWith(strA00)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        int maxLength2 = i2 + length;
                        if (maxLength2 < 90) {
                            i2 += length;
                        }
                    }
                    return i2 == 0 ? str.substring(0, 90) + strA00 : str.substring(0, i2) + strA00;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
