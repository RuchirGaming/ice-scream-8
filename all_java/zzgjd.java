package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
abstract class zzgjd {
    int[] zza;
    private final int zzb;

    public zzgjd(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgiz.zzd(bArr);
        this.zzb = i2;
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i2);

    final ByteBuffer zzc(byte[] bArr, int i2) {
        int[] iArrZzb = zzb(zzgiz.zzd(bArr), i2);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgiz.zzc(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrZzb[i3] = iArrZzb[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining / 64;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i3 >= i4) {
                return byteBufferAllocate.array();
            }
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i3);
            if (i3 == i4 - 1) {
                zzgti.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzgti.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
            i3++;
        }
    }
}
