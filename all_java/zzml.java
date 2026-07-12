package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzml {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]);
        jArr[2] = (jArr2[1] * 2 * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]);
        jArr[3] = (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]);
        jArr[4] = (jArr2[2] * jArr3[2]) + (((jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1])) * 2) + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]);
        jArr[5] = (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]);
        jArr[6] = (((jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1])) * 2) + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]);
        jArr[7] = (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]);
        jArr[8] = (jArr2[4] * jArr3[4]) + (((jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1])) * 2) + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]);
        jArr[9] = (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]);
        jArr[10] = (((jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1])) * 2) + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]);
        jArr[11] = (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]);
        jArr[12] = (jArr2[6] * jArr3[6]) + (((jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3])) * 2) + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]);
        jArr[13] = (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]);
        jArr[14] = (((jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5])) * 2) + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]);
        jArr[15] = (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]);
        jArr[16] = (jArr2[8] * jArr3[8]) + (((jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7])) * 2);
        jArr[17] = (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]);
        jArr[18] = jArr2[9] * 2 * jArr3[9];
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zza(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2] / 67108864;
            jArr[i2] = jArr[i2] - (j2 << 26);
            int i3 = i2 + 1;
            jArr[i3] = jArr[i3] + j2;
            long j3 = jArr[i3] / 33554432;
            jArr[i3] = jArr[i3] - (j3 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j3;
        }
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
        jArr[10] = 0;
        long j4 = jArr[0] / 67108864;
        jArr[0] = jArr[0] - (j4 << 26);
        jArr[1] = jArr[1] + j4;
    }

    static void zzb(long[] jArr) {
        jArr[8] = jArr[8] + (jArr[18] << 4);
        jArr[8] = jArr[8] + (jArr[18] << 1);
        jArr[8] = jArr[8] + jArr[18];
        jArr[7] = jArr[7] + (jArr[17] << 4);
        jArr[7] = jArr[7] + (jArr[17] << 1);
        jArr[7] = jArr[7] + jArr[17];
        jArr[6] = jArr[6] + (jArr[16] << 4);
        jArr[6] = jArr[6] + (jArr[16] << 1);
        jArr[6] = jArr[6] + jArr[16];
        jArr[5] = jArr[5] + (jArr[15] << 4);
        jArr[5] = jArr[5] + (jArr[15] << 1);
        jArr[5] = jArr[5] + jArr[15];
        jArr[4] = jArr[4] + (jArr[14] << 4);
        jArr[4] = jArr[4] + (jArr[14] << 1);
        jArr[4] = jArr[4] + jArr[14];
        jArr[3] = jArr[3] + (jArr[13] << 4);
        jArr[3] = jArr[3] + (jArr[13] << 1);
        jArr[3] = jArr[3] + jArr[13];
        jArr[2] = jArr[2] + (jArr[12] << 4);
        jArr[2] = jArr[2] + (jArr[12] << 1);
        jArr[2] = jArr[2] + jArr[12];
        jArr[1] = jArr[1] + (jArr[11] << 4);
        jArr[1] = jArr[1] + (jArr[11] << 1);
        jArr[1] = jArr[1] + jArr[11];
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
    }

    static void zza(long[] jArr, long[] jArr2, long j2) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] * j2;
        }
    }

    static void zzb(long[] jArr, long[] jArr2) {
        zze(new long[]{jArr2[0] * jArr2[0], jArr2[0] * 2 * jArr2[1], ((jArr2[1] * jArr2[1]) + (jArr2[0] * jArr2[2])) * 2, ((jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3])) * 2, (jArr2[2] * jArr2[2]) + (jArr2[1] * 4 * jArr2[3]) + (jArr2[0] * 2 * jArr2[4]), ((jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5])) * 2, ((jArr2[3] * jArr2[3]) + (jArr2[2] * jArr2[4]) + (jArr2[0] * jArr2[6]) + (jArr2[1] * 2 * jArr2[5])) * 2, ((jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7])) * 2, (jArr2[4] * jArr2[4]) + (((jArr2[2] * jArr2[6]) + (jArr2[0] * jArr2[8]) + (((jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5])) * 2)) * 2), ((jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9])) * 2, ((jArr2[5] * jArr2[5]) + (jArr2[4] * jArr2[6]) + (jArr2[2] * jArr2[8]) + (((jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9])) * 2)) * 2, ((jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9])) * 2, (jArr2[6] * jArr2[6]) + (((jArr2[4] * jArr2[8]) + (((jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9])) * 2)) * 2), ((jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9])) * 2, ((jArr2[7] * jArr2[7]) + (jArr2[6] * jArr2[8]) + (jArr2[5] * 2 * jArr2[9])) * 2, ((jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9])) * 2, (jArr2[8] * jArr2[8]) + (jArr2[7] * 4 * jArr2[9]), jArr2[8] * 2 * jArr2[9], jArr2[9] * 2 * jArr2[9]}, jArr);
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArrCopyOf[i4] & (jArrCopyOf[i4] >> 31);
                int[] iArr = zzd;
                int i5 = i4 & 1;
                int i6 = -((int) (j2 >> iArr[i5]));
                jArrCopyOf[i4] = jArrCopyOf[i4] + ((long) (i6 << iArr[i5]));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            int i7 = -((int) (((jArrCopyOf[9] >> 31) & jArrCopyOf[9]) >> 25));
            jArrCopyOf[9] = jArrCopyOf[9] + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        int i8 = -((int) ((jArrCopyOf[0] & (jArrCopyOf[0] >> 31)) >> 26));
        jArrCopyOf[0] = jArrCopyOf[0] + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        for (i2 = 2; i9 < i2; i2 = 2) {
            int i10 = 0;
            while (i10 < 9) {
                int i11 = i10 & 1;
                int i12 = (int) (jArrCopyOf[i10] >> zzd[i11]);
                jArrCopyOf[i10] = ((long) zzc[i11]) & jArrCopyOf[i10];
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) i12);
            }
            i9++;
        }
        int i13 = (int) (jArrCopyOf[9] >> 25);
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[0] = jArrCopyOf[0] + (((long) i13) * 19);
        int i14 = ~((((int) jArrCopyOf[0]) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) jArrCopyOf[i15]) ^ zzc[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i14));
        long j3 = 33554431 & i14;
        jArrCopyOf[1] = jArrCopyOf[1] - j3;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            jArrCopyOf[i21] = jArrCopyOf[i21] - ((long) (67108863 & i14));
            int i22 = i21 + 1;
            jArrCopyOf[i22] = jArrCopyOf[i22] - j3;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            jArrCopyOf[i23] = jArrCopyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int[] iArr2 = zza;
            int i25 = iArr2[i24];
            bArr[i25] = (byte) (((long) bArr[i25]) | (jArrCopyOf[i24] & 255));
            int i26 = iArr2[i24] + 1;
            bArr[i26] = (byte) (((long) bArr[i26]) | ((jArrCopyOf[i24] >> 8) & 255));
            int i27 = iArr2[i24] + 2;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((jArrCopyOf[i24] >> 16) & 255));
            int i28 = iArr2[i24] + 3;
            bArr[i28] = (byte) (((long) bArr[i28]) | (255 & (jArrCopyOf[i24] >> 24)));
        }
        return bArr;
    }

    static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int[] iArr = zza;
            jArr[i2] = ((((((long) (bArr[iArr[i2]] & 255)) | (((long) (bArr[iArr[i2] + 1] & 255)) << 8)) | (((long) (bArr[iArr[i2] + 2] & 255)) << 16)) | (((long) (bArr[iArr[i2] + 3] & 255)) << 24)) >> zzb[i2]) & ((long) zzc[i2 & 1]);
        }
        return jArr;
    }
}
