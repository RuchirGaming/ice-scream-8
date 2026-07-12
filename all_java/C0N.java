package com.facebook.ads.redexgen.X;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0N, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0N extends BufferedInputStream {
    public int A00;
    public int A01;
    public boolean A02;

    public C0N(InputStream inputStream) {
        super(inputStream);
        this.A00 = Integer.MAX_VALUE;
    }

    public final boolean A00() {
        return this.A02;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        this.A00 = i2;
        super.mark(i2);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = this.A01;
        if (i2 + 1 > this.A00) {
            this.A02 = true;
            return -1;
        }
        this.A01 = i2 + 1;
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (this.A01 + bArr.length > this.A00) {
            this.A02 = true;
            return -1;
        }
        return super.read(bArr);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.A01 + i3 > this.A00) {
            this.A02 = true;
            return -1;
        }
        int i4 = super.read(bArr, i2, i3);
        int read = this.A01;
        this.A01 = read + i4;
        return i4;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.A00 = Integer.MAX_VALUE;
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j2) throws IOException {
        int i2 = this.A01;
        if (((long) i2) + j2 > this.A00) {
            this.A02 = true;
            return 0L;
        }
        this.A01 = (int) (((long) i2) + j2);
        return super.skip(j2);
    }
}
