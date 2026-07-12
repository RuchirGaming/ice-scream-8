package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class DecryptionException extends Exception {
    public final int errorCode;

    public DecryptionException(int i2, String str) {
        super(str);
        this.errorCode = i2;
    }
}
