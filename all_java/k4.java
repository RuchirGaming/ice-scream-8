package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdPlaybackState f32152a = AdPlaybackState.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdsLoader.EventListener f32153b;

    public final void a(AdsLoader.EventListener eventListener) {
        this.f32153b = eventListener;
    }

    public final void b() {
        this.f32153b = null;
        this.f32152a = AdPlaybackState.NONE;
    }

    public final AdPlaybackState a() {
        return this.f32152a;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        this.f32152a = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f32153b;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
