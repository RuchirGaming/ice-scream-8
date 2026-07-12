package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class sx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Player f35322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vx0 f35323b;

    public sx0(Player player, vx0 vx0Var) {
        this.f35322a = player;
        this.f35323b = vx0Var;
    }

    public final long a() {
        Timeline timelineB = this.f35323b.b();
        return this.f35322a.getContentPosition() - (timelineB.isEmpty() ? 0L : timelineB.getPeriod(0, this.f35323b.a()).getPositionInWindowMs());
    }
}
