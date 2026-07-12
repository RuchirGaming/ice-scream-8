package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum PR {
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"5OO1eWJNP7Y3s5cQVhBQzuf4m1TAFPYu", "jypq8Huvx", "jrpdYYVceDk6A6K9eES7EYlVVXbr1rnB", "0AH7qFhs7PL8sRdpBGyIu3", "QWErYf377ArBGiXitK75JQXJw", "6gjozywHn1tStRqNZ4amJv", "kQUf5kbyDrtyo", "1dtSAN9pZ"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 3);
            if (A01[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "4K3nSgRyXAG8o";
            strArr[4] = "A3wHnoq4BiJ6LQy7c3XTOTZiL";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{117, 114, 122, 115, 106, 122, 107, 124, 124, 119, 106, 113, 118, 109, 106};
    }

    static {
        A01();
    }
}
