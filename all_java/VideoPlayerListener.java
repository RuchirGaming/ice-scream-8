package com.yandex.mobile.ads.instream.player.content;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface VideoPlayerListener {
    void onVideoCompleted();

    void onVideoError();

    void onVideoPaused();

    void onVideoPrepared();

    void onVideoResumed();
}
