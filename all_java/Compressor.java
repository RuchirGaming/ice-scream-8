package io.grpc;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface Compressor {
    OutputStream compress(OutputStream outputStream) throws IOException;

    String getMessageEncoding();
}
