package io.grpc;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface Decompressor {
    InputStream decompress(InputStream inputStream) throws IOException;

    String getMessageEncoding();
}
