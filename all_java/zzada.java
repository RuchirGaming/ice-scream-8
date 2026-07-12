package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzada {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i2;
        if ((byteBuffer.get(5) & 2) == 0) {
            i2 = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i3 = 28;
            int i4 = 28;
            for (int i5 = 0; i5 < b2; i5++) {
                i4 += byteBuffer.get(i5 + 27);
            }
            byte b3 = byteBuffer.get(i4 + 26);
            for (int i6 = 0; i6 < b3; i6++) {
                i3 += byteBuffer.get(i4 + 27 + i6);
            }
            i2 = i4 + i3;
        }
        int i7 = byteBuffer.get(i2 + 26) + 27 + i2;
        return (int) ((zzf(byteBuffer.get(i7), byteBuffer.limit() - i7 > 1 ? byteBuffer.get(i7 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzf(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzf(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long jZza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzg(jZza)));
        arrayList.add(zzh(zzg(3840L)));
        return arrayList;
    }

    private static long zzf(byte b2, byte b3) {
        int i2;
        int i3 = b2 & 255;
        int i4 = i3 & 3;
        int i5 = 2;
        if (i4 == 0) {
            i5 = 1;
        } else if (i4 != 1 && i4 != 2) {
            i5 = b3 & Utf8.REPLACEMENT_BYTE;
        }
        int i6 = i3 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i2 = 2500 << i7;
        } else if (i6 >= 12) {
            i2 = 10000 << (i7 & 1);
        } else {
            i2 = i7 == 3 ? 60000 : 10000 << i7;
        }
        return ((long) i5) * ((long) i2);
    }

    private static long zzg(long j2) {
        return (j2 * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] zzh(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }
}
