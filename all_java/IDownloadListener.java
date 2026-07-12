package com.mbridge.msdk.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IDownloadListener {
    void onEnd(int i2, int i3, String str);

    void onProgressUpdate(int i2);

    void onStart();

    void onStatus(int i2);
}
