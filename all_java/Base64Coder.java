package cn.thinkinganalyticsclone.android.utils;

import com.ironsource.sdk.constants.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class Base64Coder {
    private static final char[] map1 = new char[64];
    private static final byte[] map2;

    static {
        char c2 = 'A';
        int i2 = 0;
        while (c2 <= 'Z') {
            map1[i2] = c2;
            c2 = (char) (c2 + 1);
            i2++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            map1[i2] = c3;
            c3 = (char) (c3 + 1);
            i2++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            map1[i2] = c4;
            c4 = (char) (c4 + 1);
            i2++;
        }
        char[] cArr = map1;
        cArr[i2] = '+';
        cArr[i2 + 1] = '/';
        map2 = new byte[128];
        int i3 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = -1;
            i3++;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            map2[map1[i4]] = (byte) i4;
        }
    }

    public static String encodeString(String s2) {
        return new String(encode(s2.getBytes()));
    }

    public static char[] encode(byte[] in) {
        return encode(in, in.length);
    }

    public static char[] encode(byte[] in, int iLen) {
        int i2;
        int i3;
        int i4;
        int i5 = ((iLen * 4) + 2) / 3;
        char[] cArr = new char[((iLen + 2) / 3) * 4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < iLen) {
            int i8 = i6 + 1;
            int i9 = in[i6] & 255;
            if (i8 < iLen) {
                i2 = i8 + 1;
                i3 = in[i8] & 255;
            } else {
                i2 = i8;
                i3 = 0;
            }
            if (i2 < iLen) {
                i4 = in[i2] & 255;
                i2++;
            } else {
                i4 = 0;
            }
            int i10 = i9 >>> 2;
            int i11 = ((i9 & 3) << 4) | (i3 >>> 4);
            int i12 = ((i3 & 15) << 2) | (i4 >>> 6);
            int i13 = i7 + 1;
            char[] cArr2 = map1;
            cArr[i7] = cArr2[i10];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[i11];
            char c2 = b.R;
            cArr[i14] = i14 < i5 ? cArr2[i12] : '=';
            int i15 = i14 + 1;
            int i16 = i4 & 63;
            if (i15 < i5) {
                c2 = cArr2[i16];
            }
            cArr[i15] = c2;
            i7 = i15 + 1;
            i6 = i2;
        }
        return cArr;
    }

    public static String decodeString(String s2) {
        return new String(decode(s2));
    }

    public static byte[] decode(String s2) {
        return decode(s2.toCharArray());
    }

    public static byte[] decode(char[] in) {
        int i2;
        char c2;
        char c3;
        int i3;
        int length = in.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && in[length - 1] == '=') {
            length--;
        }
        int i4 = (length * 3) / 4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3) {
            int i7 = i6 + 1;
            char c4 = in[i6];
            int i8 = i7 + 1;
            char c5 = in[i7];
            if (i8 < length) {
                i2 = i8 + 1;
                c2 = in[i8];
            } else {
                i2 = i8;
                c2 = 'A';
            }
            if (i2 < length) {
                i3 = i2 + 1;
                c3 = in[i2];
            } else {
                int i9 = i2;
                c3 = 'A';
                i3 = i9;
            }
            if (c4 > 127 || c5 > 127 || c2 > 127 || c3 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = map2;
            byte b2 = bArr2[c4];
            byte b3 = bArr2[c5];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i10 = (b2 << 2) | (b3 >>> 4);
            int i11 = ((b3 & 15) << 4) | (b4 >>> 2);
            int i12 = ((b4 & 3) << 6) | b5;
            int i13 = i5 + 1;
            bArr[i5] = (byte) i10;
            if (i13 < i4) {
                bArr[i13] = (byte) i11;
                i13++;
            }
            if (i13 < i4) {
                bArr[i13] = (byte) i12;
                i5 = i13 + 1;
            } else {
                i5 = i13;
            }
        }
        return bArr;
    }
}
