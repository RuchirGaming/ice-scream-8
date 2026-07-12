package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzcer implements zzhdb {
    private final ByteBuffer zza;

    zzcer(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[iMin];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final ByteBuffer zzd(long j2, long j3) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j2);
        ByteBuffer byteBufferSlice = this.zza.slice();
        byteBufferSlice.limit((int) j3);
        this.zza.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final void zze(long j2) throws IOException {
        this.zza.position((int) j2);
    }
}
