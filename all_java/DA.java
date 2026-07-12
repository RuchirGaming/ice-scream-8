package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class DA {
    public static byte[] A00;
    public static String[] A01 = {"baVHNJzNANFnY1sXkXZczBpKXzzSELDJ", "FJDCDULbybk31yXIvavqVvo2MicyH1aO", "K5IelWz6", "FdTbrt0ZL", "L8wW0lj5Otl6fi1MjRxzAQsIUgUke571", "mk5Gt8c3oV5jI8LyKcE86", "7JcRYM5esVvDeFOwjRyEQKpjADMcRwiD", "vrbl2XRh5nY8mdFWk2TMR4MRI9Bh0"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{45, 57, 54, 57, 60, -9, 60, 43, 56, 49, 47, -11, 1, -2, 1, 4, -65, 5, 6, -13, 0, -10, -13, 4, -10, 18, 30, 27, 30, 33, -36, 35, 33, 16, 29, 34, 21, 20, 33, 3, 19, 4, -51, -14, -18, -4, -73, -3, -2, -21, -2, -13, -19, -73, -13, -8, -16, -7};
    }

    static {
        A01();
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 59), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 30), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 86), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 22), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        int i2 = 0;
        while (true) {
            int size = list.size();
            if (A01[2].length() != 8) {
                throw new RuntimeException();
            }
            A01[0] = "5g98DeOKXRonF2SHWvMVynJwaAQ3gOVI";
            if (i2 < size) {
                mediaFormat.setByteBuffer(A00(39, 4, 44) + i2, ByteBuffer.wrap(list.get(i2)));
                i2++;
            } else {
                return;
            }
        }
    }
}
