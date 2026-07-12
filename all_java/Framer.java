package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface Framer {
    void close();

    void dispose();

    void flush();

    boolean isClosed();

    Framer setCompressor(Compressor compressor);

    void setMaxOutboundMessageSize(int i2);

    Framer setMessageCompression(boolean z);

    void writePayload(InputStream inputStream);
}
