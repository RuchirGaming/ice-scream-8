package com.mbridge.msdk.playercommon.exoplayer2.offline;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface Downloader {
    void cancel();

    void download() throws InterruptedException, IOException;

    float getDownloadPercentage();

    long getDownloadedBytes();

    void remove() throws InterruptedException;
}
