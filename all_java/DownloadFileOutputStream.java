package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j2) throws IllegalAccessException, IOException;

    void setLength(long j2) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i2, int i3) throws IOException;
}
