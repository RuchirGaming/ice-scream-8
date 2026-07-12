package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class c21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f29592a;

    public final long a() {
        Long l2 = this.f29592a;
        if (l2 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l2.longValue();
    }

    public final void b() {
        this.f29592a = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
