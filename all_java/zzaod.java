package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzaod extends ByteArrayOutputStream {
    private final zzanr zza;

    public zzaod(zzanr zzanrVar, int i2) {
        this.zza = zzanrVar;
        this.buf = zzanrVar.zzb(Math.max(i2, 256));
    }

    private final void zza(int i2) {
        if (this.count + i2 <= this.buf.length) {
            return;
        }
        zzanr zzanrVar = this.zza;
        int i3 = this.count + i2;
        byte[] bArrZzb = zzanrVar.zzb(i3 + i3);
        System.arraycopy(this.buf, 0, bArrZzb, 0, this.count);
        this.zza.zza(this.buf);
        this.buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        zza(1);
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        zza(i3);
        super.write(bArr, i2, i3);
    }
}
