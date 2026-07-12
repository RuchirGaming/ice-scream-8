package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1318Tr implements InterfaceC1095Lb {
    public static String[] A00 = {"hdmHMjdsCvnnIiAm68nbzST5FT4P5mLb", "EH3LUmZxwOvThvXMHcswnn58jDASieiK", "ljU4lnctUqCxo644HWpRzVkau739AG18", "cf0wMMVzQ5eDMzw1G9WbfLTL5VaSUv", "l50byEuqIAJWTFcEqiPP3cq5SFvrKOhf", "BkuhnFfUhQO532vAuKLRONmm63PuLWNO", "lueSUxwI7577CW", "p49ZYnIXKwO4jtZLxoBrhqW2OVcn4ZYc"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    public static void A00(int[] iArr, int src_i, int y, int minX, int i2, int i3, int i4) {
        int maxY = src_i - 1;
        int i5 = y - 1;
        int stack_start = (minX * 2) + 1;
        short s2 = A02[minX];
        byte b2 = A01[minX];
        int[] iArr2 = new int[stack_start];
        long j2 = 0;
        if (i4 == 1) {
            int i6 = (i3 * y) / i2;
            int i7 = ((i3 + 1) * y) / i2;
            while (i6 < i7) {
                long sum_out_b = j2;
                long j3 = j2;
                long j4 = j2;
                long j5 = j2;
                long j6 = j2;
                long j7 = j2;
                long j8 = j2;
                long j9 = j2;
                int wm = src_i * i6;
                for (int i8 = 0; i8 <= minX; i8++) {
                    iArr2[i8] = iArr[wm];
                    j9 += (long) (((iArr[wm] >>> 16) & 255) * (i8 + 1));
                    j8 += (long) (((iArr[wm] >>> 8) & 255) * (i8 + 1));
                    j7 += (long) ((iArr[wm] & 255) * (i8 + 1));
                    j3 += (long) ((iArr[wm] >>> 16) & 255);
                    sum_out_b += (long) ((iArr[wm] >>> 8) & 255);
                    j2 += (long) (iArr[wm] & 255);
                }
                for (int i9 = 1; i9 <= minX; i9++) {
                    if (i9 <= maxY) {
                        wm++;
                    }
                    iArr2[i9 + minX] = iArr[wm];
                    j9 += (long) (((iArr[wm] >>> 16) & 255) * ((minX + 1) - i9));
                    j8 += (long) (((iArr[wm] >>> 8) & 255) * ((minX + 1) - i9));
                    j7 += (long) ((iArr[wm] & 255) * ((minX + 1) - i9));
                    j6 += (long) ((iArr[wm] >>> 16) & 255);
                    j5 += (long) ((iArr[wm] >>> 8) & 255);
                    j4 += (long) (iArr[wm] & 255);
                }
                int i10 = minX;
                int i11 = minX;
                if (i11 > maxY) {
                    i11 = maxY;
                }
                int i12 = (i6 * src_i) + i11;
                int i13 = i6 * src_i;
                for (int i14 = 0; i14 < src_i; i14++) {
                    iArr[i13] = (int) (((long) (iArr[i13] & ViewCompat.MEASURED_STATE_MASK)) | ((((((long) s2) * j9) >>> b2) & 255) << 16) | ((((((long) s2) * j8) >>> b2) & 255) << 8) | (((((long) s2) * j7) >>> b2) & 255));
                    i13++;
                    long j10 = j9 - j3;
                    long j11 = j8 - sum_out_b;
                    long j12 = j7 - j2;
                    int i15 = (i10 + stack_start) - minX;
                    if (i15 >= stack_start) {
                        i15 -= stack_start;
                    }
                    long j13 = j3 - ((long) ((iArr2[i15] >>> 16) & 255));
                    long sum_out_b2 = sum_out_b - ((long) ((iArr2[i15] >>> 8) & 255));
                    long j14 = j2 - ((long) (iArr2[i15] & 255));
                    int stack_i = i11;
                    if (stack_i < maxY) {
                        i12++;
                        i11++;
                    }
                    iArr2[i15] = iArr[i12];
                    long j15 = j6 + ((long) ((iArr[i12] >>> 16) & 255));
                    long j16 = j5 + ((long) ((iArr[i12] >>> 8) & 255));
                    long j17 = j4 + ((long) (iArr[i12] & 255));
                    j9 = j10 + j15;
                    j8 = j11 + j16;
                    j7 = j12 + j17;
                    int i16 = i10 + 1;
                    if (i16 >= stack_start) {
                        i16 = 0;
                    }
                    int stack_i2 = iArr2[i16];
                    i10 = i16;
                    j3 = j13 + ((long) ((stack_i2 >>> 16) & 255));
                    int stack_i3 = iArr2[i16];
                    sum_out_b = sum_out_b2 + ((long) ((stack_i3 >>> 8) & 255));
                    int stack_i4 = iArr2[i16];
                    j2 = j14 + ((long) (stack_i4 & 255));
                    int stack_i5 = iArr2[i16];
                    j6 = j15 - ((long) ((stack_i5 >>> 16) & 255));
                    int stack_i6 = iArr2[i16];
                    j5 = j16 - ((long) ((stack_i6 >>> 8) & 255));
                    int stack_i7 = iArr2[i16];
                    j4 = j17 - ((long) (stack_i7 & 255));
                }
                i6++;
                j2 = 0;
            }
            return;
        }
        if (i4 == 2) {
            int i17 = (i3 * src_i) / i2;
            int i18 = ((i3 + 1) * src_i) / i2;
            while (maxX < i18) {
                long j18 = 0;
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                int wm2 = i17;
                for (int i19 = 0; i19 <= minX; i19++) {
                    iArr2[i19] = iArr[wm2];
                    int maxX = i19 + 1;
                    j26 += (long) (((iArr[wm2] >>> 16) & 255) * maxX);
                    j25 += (long) (((iArr[wm2] >>> 8) & 255) * (i19 + 1));
                    j24 += (long) ((iArr[wm2] & 255) * (i19 + 1));
                    j20 += (long) ((iArr[wm2] >>> 16) & 255);
                    j19 += (long) ((iArr[wm2] >>> 8) & 255);
                    j18 += (long) (iArr[wm2] & 255);
                }
                for (int i20 = 1; i20 <= minX; i20++) {
                    if (i20 <= i5) {
                        wm2 += src_i;
                    }
                    int stack_i8 = i20 + minX;
                    iArr2[stack_i8] = iArr[wm2];
                    int stack_i9 = minX + 1;
                    j26 += (long) (((iArr[wm2] >>> 16) & 255) * (stack_i9 - i20));
                    int stack_i10 = minX + 1;
                    j25 += (long) (((iArr[wm2] >>> 8) & 255) * (stack_i10 - i20));
                    int stack_i11 = minX + 1;
                    j24 += (long) ((iArr[wm2] & 255) * (stack_i11 - i20));
                    j23 += (long) ((iArr[wm2] >>> 16) & 255);
                    j22 += (long) ((iArr[wm2] >>> 8) & 255);
                    j21 += (long) (iArr[wm2] & 255);
                }
                int hm = minX;
                int sp = minX;
                if (sp > i5) {
                    sp = i5;
                }
                int i21 = (sp * src_i) + i17;
                int i22 = i17;
                for (int sp2 = 0; sp2 < y; sp2++) {
                    iArr[i22] = (int) (((long) (iArr[i22] & ViewCompat.MEASURED_STATE_MASK)) | ((((((long) s2) * j26) >>> b2) & 255) << 16) | ((((((long) s2) * j25) >>> b2) & 255) << 8) | (((((long) s2) * j24) >>> b2) & 255));
                    i22 += src_i;
                    long j27 = j26 - j20;
                    long j28 = j25 - j19;
                    long j29 = j24 - j18;
                    int stack_start2 = (hm + stack_start) - minX;
                    if (stack_start2 >= stack_start) {
                        stack_start2 -= stack_start;
                    }
                    long j30 = j20 - ((long) ((iArr2[stack_start2] >>> 16) & 255));
                    long j31 = j19 - ((long) ((iArr2[stack_start2] >>> 8) & 255));
                    long j32 = j18 - ((long) (iArr2[stack_start2] & 255));
                    if (sp < i5) {
                        i21 += src_i;
                        sp++;
                    }
                    iArr2[stack_start2] = iArr[i21];
                    long j33 = j23 + ((long) ((iArr[i21] >>> 16) & 255));
                    long j34 = j22 + ((long) ((iArr[i21] >>> 8) & 255));
                    long j35 = j21 + ((long) (iArr[i21] & 255));
                    j26 = j27 + j33;
                    j25 = j28 + j34;
                    j24 = j29 + j35;
                    hm++;
                    if (hm >= stack_start) {
                        hm = 0;
                    }
                    j20 = j30 + ((long) ((iArr2[hm] >>> 16) & 255));
                    j19 = j31 + ((long) ((iArr2[hm] >>> 8) & 255));
                    j18 = j32 + ((long) (iArr2[hm] & 255));
                    j23 = j33 - ((long) ((iArr2[hm] >>> 16) & 255));
                    j22 = j34 - ((long) ((iArr2[hm] >>> 8) & 255));
                    j21 = j35 - ((long) (iArr2[hm] & 255));
                }
                i17++;
                String[] strArr = A00;
                if (strArr[4].charAt(24) == strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "dRrOf81uK3m7JlCVGnAp7HBN8Ud450kD";
                strArr2[0] = "ERfsWS88AUosonNdTmqfcWCTdCaDCKBU";
            }
        }
    }

    public final Bitmap A02(Bitmap bitmap, float f2) {
        int w = bitmap.getWidth();
        int h2 = bitmap.getHeight();
        try {
            int[] iArr = new int[w * h2];
            bitmap.getPixels(iArr, 0, w, 0, 0, w, h2);
            int i2 = C1100Lg.A00;
            ArrayList arrayList = new ArrayList(i2);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int h3 = h2;
                int cores = i3;
                arrayList.add(new CallableC1099Lf(iArr, w, h3, (int) f2, i2, cores, 1));
                h2 = h3;
                int cores2 = i3;
                vertical.add(new CallableC1099Lf(iArr, w, h2, (int) f2, i2, cores2, 2));
            }
            try {
                C1100Lg.A01.invokeAll(arrayList);
                try {
                    C1100Lg.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w, h2, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
