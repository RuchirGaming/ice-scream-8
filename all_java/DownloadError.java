package com.mbridge.msdk.foundation.download;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class DownloadError {
    private Exception exception;

    public DownloadError(Exception exc) {
        this.exception = exc;
    }

    public Exception getException() {
        return this.exception;
    }
}
