package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.b.n$h$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f32245b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f32244a = new n$h$$ExternalSyntheticLambda0(new Handler(Looper.getMainLooper()));

    public final ExecutorService a() {
        return this.f32245b;
    }

    public final Executor b() {
        return this.f32244a;
    }
}
