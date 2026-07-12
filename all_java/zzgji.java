package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgji {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j6 + ((j11 >> 26) * 5);
                long j14 = j13 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j3 & 67108863) + (j13 >> 26);
                long j17 = j16 + (j15 >> 26);
                long j18 = (j17 >> 26) + j8;
                long j19 = j10 + (j18 >> 26);
                long j20 = (j12 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j8 & j21) | (j18 & 67108863 & j22);
                long j25 = (j10 & j21) | (j19 & 67108863 & j22);
                long j26 = (j12 & j21) | (j20 & j22);
                long jZzc = (((j21 & j14) | (j15 & 67108863 & j22) | (j23 << 26)) & 4294967295L) + zzc(bArr, 16);
                long jZzc2 = (((j23 >> 6) | (j24 << 20)) & 4294967295L) + zzc(bArr, 20);
                long jZzc3 = (((j24 >> 12) | (j25 << 14)) & 4294967295L) + zzc(bArr, 24);
                long jZzc4 = (((j25 >> 18) | (j26 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & 4294967295L, 0);
                long j27 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j27 & 4294967295L, 4);
                long j28 = jZzc3 + (j27 >> 32);
                zzd(bArr4, j28 & 4294967295L, 8);
                zzd(bArr4, (jZzc4 + (j28 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
            }
            long j29 = jZzb5 * 5;
            long j30 = jZzb4 * 5;
            long j31 = jZzb3 * 5;
            long jZzb6 = j6 + zzb(bArr3, 0, 0);
            long jZzb7 = j3 + zzb(bArr3, 3, 2);
            long jZzb8 = j2 + zzb(bArr3, 6, 4);
            long jZzb9 = j4 + zzb(bArr3, 9, 6);
            long jZzb10 = j5 + (zzb(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j32 = jZzb7 * jZzb;
            long j33 = jZzb7 * jZzb2;
            long j34 = jZzb7 * jZzb3;
            long j35 = jZzb9 * jZzb;
            long j36 = jZzb7 * jZzb4;
            long j37 = jZzb10 * jZzb;
            long j38 = (jZzb6 * jZzb) + (jZzb7 * j29) + (jZzb8 * j30) + (jZzb9 * j31) + (jZzb2 * 5 * jZzb10);
            long j39 = (jZzb6 * jZzb2) + j32 + (jZzb8 * j29) + (jZzb9 * j30) + (j31 * jZzb10) + (j38 >> 26);
            long j40 = (jZzb6 * jZzb3) + j33 + (jZzb8 * jZzb) + (jZzb9 * j29) + (j30 * jZzb10) + (j39 >> 26);
            long j41 = (jZzb6 * jZzb4) + j34 + (jZzb8 * jZzb2) + j35 + (jZzb10 * j29) + (j40 >> 26);
            long j42 = (jZzb6 * jZzb5) + j36 + (jZzb8 * jZzb3) + (jZzb9 * jZzb2) + j37 + (j41 >> 26);
            long j43 = (j38 & 67108863) + ((j42 >> 26) * 5);
            j3 = (j39 & 67108863) + (j43 >> 26);
            i3 += 16;
            j2 = j40 & 67108863;
            j4 = j41 & 67108863;
            j5 = j42 & 67108863;
            i2 = 17;
            j6 = j43 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i2, int i3) {
        return (zzc(bArr, i2) >> i3) & 67108863;
    }

    private static long zzc(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }
}
