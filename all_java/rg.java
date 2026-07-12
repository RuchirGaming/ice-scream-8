package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class rg {
    public static Bitmap a(Bitmap bitmap) {
        try {
            return b(bitmap);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Bitmap b(Bitmap bitmap) {
        int i2 = 0;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.1f), Math.round(bitmap.getHeight() * 0.1f), false);
        int i3 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[1024];
        for (int i7 = 0; i7 < 1024; i7++) {
            iArr6[i7] = i7 / 4;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) int.class, 3, 3);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < height) {
            int i11 = i2;
            int i12 = i11;
            int i13 = i12;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            int i19 = -1;
            int i20 = i18;
            while (i19 <= i3) {
                int i21 = iArr[Math.min(i5, Math.max(i19, i2)) + i9];
                int i22 = i19 + 1;
                int[] iArr8 = iArr7[i22];
                iArr8[i2] = (i21 & 16711680) >> 16;
                iArr8[1] = (i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr8[2] = i21 & 255;
                int iAbs = 2 - StrictMath.abs(i19);
                int i23 = iArr8[i2];
                i20 = (i23 * iAbs) + i20;
                int i24 = iArr8[1];
                i11 = (i24 * iAbs) + i11;
                int i25 = iArr8[2];
                i12 = (iAbs * i25) + i12;
                if (i19 > 0) {
                    i16 += i23;
                    i18 += i24;
                    i17 += i25;
                } else {
                    i15 += i23;
                    i14 += i24;
                    i13 += i25;
                }
                i19 = i22;
                i3 = 1;
            }
            int i26 = i2;
            int i27 = 1;
            while (i26 < width) {
                iArr2[i9] = iArr6[i20];
                iArr3[i9] = iArr6[i11];
                iArr4[i9] = iArr6[i12];
                int i28 = i20 - i15;
                int i29 = i11 - i14;
                int i30 = i12 - i13;
                int[] iArr9 = iArr7[((i27 - 1) + 3) % 3];
                int i31 = i15 - iArr9[i2];
                int i32 = i14 - iArr9[1];
                int i33 = i13 - iArr9[2];
                if (i8 == 0) {
                    iArr5[i26] = Math.min(i26 + 1 + 1, i5);
                }
                int i34 = iArr[i10 + iArr5[i26]];
                int i35 = (i34 & 16711680) >> 16;
                iArr9[0] = i35;
                int i36 = (i34 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[1] = i36;
                int i37 = i34 & 255;
                iArr9[2] = i37;
                int i38 = i16 + i35;
                int i39 = i18 + i36;
                int i40 = i17 + i37;
                i20 = i28 + i38;
                i11 = i29 + i39;
                i12 = i30 + i40;
                i27 = (i27 + 1) % 3;
                int[] iArr10 = iArr7[i27 % 3];
                int i41 = iArr10[0];
                i15 = i31 + i41;
                int i42 = iArr10[1];
                i14 = i32 + i42;
                int i43 = iArr10[2];
                i13 = i33 + i43;
                i16 = i38 - i41;
                i18 = i39 - i42;
                i17 = i40 - i43;
                i9++;
                i26++;
                i2 = 0;
            }
            i10 += width;
            i8++;
            i2 = 0;
            i3 = 1;
        }
        int i44 = 0;
        while (i44 < width) {
            int i45 = width * (-1);
            Bitmap bitmap2 = bitmapCopy;
            int[] iArr11 = iArr5;
            int i46 = -1;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            for (int i56 = 1; i46 <= i56; i56 = 1) {
                int iMax = Math.max(0, i45) + i44;
                int i57 = i46 + 1;
                int[] iArr12 = iArr7[i57];
                iArr12[0] = iArr2[iMax];
                iArr12[1] = iArr3[iMax];
                iArr12[2] = iArr4[iMax];
                int iAbs2 = 2 - StrictMath.abs(i46);
                i47 = (iArr2[iMax] * iAbs2) + i47;
                i48 = (iArr3[iMax] * iAbs2) + i48;
                i49 = (iArr4[iMax] * iAbs2) + i49;
                if (i46 > 0) {
                    i53 += iArr12[0];
                    i55 += iArr12[1];
                    i54 += iArr12[2];
                } else {
                    i52 += iArr12[0];
                    i51 += iArr12[1];
                    i50 += iArr12[2];
                }
                if (i46 < i6) {
                    i45 += width;
                }
                i46 = i57;
            }
            int i58 = i44;
            int i59 = 0;
            int i60 = 1;
            while (i59 < height) {
                iArr[i58] = (iArr[i58] & ViewCompat.MEASURED_STATE_MASK) | (iArr6[i47] << 16) | (iArr6[i48] << 8) | iArr6[i49];
                int i61 = i47 - i52;
                int i62 = i48 - i51;
                int i63 = i49 - i50;
                int[] iArr13 = iArr7[((i60 - 1) + 3) % 3];
                int i64 = i52 - iArr13[0];
                int i65 = i51 - iArr13[1];
                int i66 = i50 - iArr13[2];
                if (i44 == 0) {
                    iArr11[i59] = Math.min(i59 + 2, i6) * width;
                }
                int i67 = iArr11[i59] + i44;
                int i68 = iArr2[i67];
                iArr13[0] = i68;
                int i69 = iArr3[i67];
                iArr13[1] = i69;
                int i70 = iArr4[i67];
                iArr13[2] = i70;
                int i71 = i53 + i68;
                int i72 = i55 + i69;
                int i73 = i54 + i70;
                i47 = i61 + i71;
                i48 = i62 + i72;
                i49 = i63 + i73;
                i60 = (i60 + 1) % 3;
                int[] iArr14 = iArr7[i60];
                int i74 = iArr14[0];
                i52 = i64 + i74;
                int i75 = iArr14[1];
                i51 = i65 + i75;
                int i76 = iArr14[2];
                i50 = i66 + i76;
                i53 = i71 - i74;
                i55 = i72 - i75;
                i54 = i73 - i76;
                i58 += width;
                i59++;
                iArr6 = iArr6;
            }
            i44++;
            bitmapCopy = bitmap2;
            iArr5 = iArr11;
            iArr6 = iArr6;
        }
        Bitmap bitmap3 = bitmapCopy;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap3;
    }
}
