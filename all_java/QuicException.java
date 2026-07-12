package org.chromium.net;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class QuicException extends NetworkException {
    public abstract int getQuicDetailedErrorCode();

    protected QuicException(String str, Throwable th) {
        super(str, th);
    }
}
