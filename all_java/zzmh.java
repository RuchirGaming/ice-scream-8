package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzmh {
    protected static final Charset zza = StandardCharsets.UTF_16;

    protected static int zza(int i2, int i3) {
        if (i2 % 2 != 0) {
            return (i2 | i3) - (i2 & i3);
        }
        return ((~i2) & i3) | ((~i3) & i2);
    }

    public static String zzb(String str, byte[] bArr, zzmi zzmiVar) {
        int i2 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        char c2 = '\f';
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        int i3 = 16;
        int[] iArr2 = new int[16];
        for (int i4 = 0; i4 < 4; i4++) {
            iArr2[i4] = zza(iArr[i4], 2131181306);
        }
        for (int i5 = 4; i5 < 12; i5++) {
            iArr2[i5] = zze(bArr, (i5 - 4) * 4);
        }
        iArr2[12] = 1;
        for (int i6 = 13; i6 < 16; i6++) {
            iArr2[i6] = zze(bArr2, (i6 - 13) * 4);
        }
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        byte[] bArr4 = new byte[length];
        int i7 = length;
        int i8 = 1;
        int i9 = 0;
        while (i7 > 0) {
            System.arraycopy(iArr3, i2, iArr2, i2, i3);
            iArr2[c2] = i8;
            int i10 = i2;
            while (i10 < 10) {
                int[] iArr4 = iArr3;
                int i11 = i8;
                zzc(0, 4, 8, 12, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(1, 5, 9, 13, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(2, 6, 10, 14, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(3, 7, 11, 15, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(0, 5, 10, 15, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(1, 6, 11, 12, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(2, 7, 8, 13, iArr, bArr, bArr2, i11, iArr2, iArr4);
                zzc(3, 4, 9, 14, iArr, bArr, bArr2, i11, iArr2, iArr4);
                i10++;
                i3 = i3;
                i7 = i7;
                bArr4 = bArr4;
                iArr3 = iArr4;
            }
            int i12 = i7;
            byte[] bArr5 = bArr4;
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr2;
            int i13 = i3;
            byte[] bArr6 = new byte[64];
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = iArr6[i14];
                int i16 = i14 * 4;
                bArr6[i16] = (byte) (i15 & 255);
                bArr6[i16 + 1] = (byte) ((i15 >> 8) & 255);
                bArr6[i16 + 2] = (byte) ((i15 >> 16) & 255);
                bArr6[i16 + 3] = (byte) ((i15 >> 24) & 255);
            }
            for (int i17 = 0; i17 < Math.min(64, i12); i17++) {
                int i18 = i9 + i17;
                bArr5[i18] = (byte) zza(bArr6[i17], bArr3[i18]);
            }
            i8++;
            i7 = i12 - 64;
            i9 += 64;
            i3 = i13;
            bArr4 = bArr5;
            iArr3 = iArr5;
            iArr2 = iArr6;
            i2 = 0;
            c2 = '\f';
        }
        return new String(bArr4, zza);
    }

    protected static final void zzc(int i2, int i3, int i4, int i5, int[] iArr, byte[] bArr, byte[] bArr2, int i6, int[] iArr2, int[] iArr3) {
        zzd(i2, i3, i5, 16, iArr, bArr, bArr2, i6, iArr2, iArr3);
        zzd(i4, i5, i3, 12, iArr, bArr, bArr2, i6, iArr2, iArr3);
        zzd(i2, i3, i5, 8, iArr, bArr, bArr2, i6, iArr2, iArr3);
        zzd(i4, i5, i3, 7, iArr, bArr, bArr2, i6, iArr2, iArr3);
    }

    protected static final void zzd(int i2, int i3, int i4, int i5, int[] iArr, byte[] bArr, byte[] bArr2, int i6, int[] iArr2, int[] iArr3) {
        int i7 = iArr2[i2] + iArr2[i3];
        iArr2[i2] = i7;
        int iZza = zza(iArr2[i4], i7);
        iArr2[i4] = (iZza << i5) | (iZza >>> (32 - i5));
    }

    private static final int zze(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }
}
