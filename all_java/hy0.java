package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class hy0 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hh f31463a;

    public hy0(hh hhVar, int i2) {
        this.f31463a = hhVar;
        ((ByteArrayOutputStream) this).buf = hhVar.a(Math.max(i2, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f31463a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f31463a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count + 1;
        if (i3 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f31463a.a(i3 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f31463a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        int i4 = ((ByteArrayOutputStream) this).count + i3;
        if (i4 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f31463a.a(i4 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f31463a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(bArr, i2, i3);
    }
}
