package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface Stream {
    void flush();

    boolean isReady();

    void optimizeForDirectExecutor();

    void request(int i2);

    void setCompressor(Compressor compressor);

    void setMessageCompression(boolean z);

    void writeMessage(InputStream inputStream);
}
