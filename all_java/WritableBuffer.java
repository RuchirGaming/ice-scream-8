package io.grpc.internal;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface WritableBuffer {
    int readableBytes();

    void release();

    int writableBytes();

    void write(byte b2);

    void write(byte[] bArr, int i2, int i3);
}
