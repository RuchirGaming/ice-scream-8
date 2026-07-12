package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    LengthCountingOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.length += (long) i3;
    }

    long getLength() {
        return this.length;
    }
}
