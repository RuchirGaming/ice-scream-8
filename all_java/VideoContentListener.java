package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface VideoContentListener extends InneractiveContentController.EventsListener {
    void onCompleted();

    @Deprecated
    void onPlayerError();

    void onProgress(int i2, int i3);
}
