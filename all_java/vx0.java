package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class vx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timeline.Period f36205a = new Timeline.Period();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timeline f36206b = Timeline.EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36207c;

    public final Timeline.Period a() {
        return this.f36205a;
    }

    public final Timeline b() {
        return this.f36206b;
    }

    public final boolean c() {
        return this.f36207c;
    }

    public final void a(boolean z) {
        this.f36207c = z;
    }

    public final void a(Timeline timeline) {
        this.f36206b = timeline;
    }
}
