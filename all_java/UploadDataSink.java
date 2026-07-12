package org.chromium.net;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
