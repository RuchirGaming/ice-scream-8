package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface ReadableBuffer extends Closeable {
    byte[] array();

    int arrayOffset();

    boolean byteBufferSupported();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    ByteBuffer getByteBuffer();

    boolean hasArray();

    void mark();

    boolean markSupported();

    ReadableBuffer readBytes(int i2);

    void readBytes(OutputStream outputStream, int i2) throws IOException;

    void readBytes(ByteBuffer byteBuffer);

    void readBytes(byte[] bArr, int i2, int i3);

    int readInt();

    int readUnsignedByte();

    int readableBytes();

    void reset();

    void skipBytes(int i2);
}
