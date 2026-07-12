package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s2, int i2);

    void onTransferEnd(S s2);

    void onTransferStart(S s2, DataSpec dataSpec);
}
