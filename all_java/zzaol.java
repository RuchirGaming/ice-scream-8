package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzaol {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i2 = bArr[0] << 24;
        int i3 = bArr[1] << 16;
        int i4 = bArr[2] << 8;
        return ((double) ((((i2 & ViewCompat.MEASURED_STATE_MASK) | (i3 & 16711680)) | (65280 & i4)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i2 = bArr[0] << 24;
        int i3 = bArr[1] << 16;
        int i4 = bArr[2] << 8;
        return ((double) ((((i2 & ViewCompat.MEASURED_STATE_MASK) | (i3 & 16711680)) | (65280 & i4)) | (bArr[3] & 255))) / 65536.0d;
    }

    public static int zzc(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long jZze = zze(byteBuffer) << 32;
        if (jZze >= 0) {
            return jZze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
