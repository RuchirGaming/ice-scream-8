package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzanu extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzanu(InputStream inputStream, long j2) {
        super(inputStream);
        this.zza = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = super.read();
        if (i2 != -1) {
            this.zzb++;
        }
        return i2;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = super.read(bArr, i2, i3);
        if (i4 != -1) {
            this.zzb += (long) i4;
        }
        return i4;
    }
}
