package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class UnsupportedDrmException extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    public @interface Reason {
    }

    public UnsupportedDrmException(int i2) {
        this.reason = i2;
    }

    public UnsupportedDrmException(int i2, Exception exc) {
        super(exc);
        this.reason = i2;
    }
}
