package com.yandex.mobile.ads.impl;

import java.util.Queue;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qd0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f34195a;

    public qd0(Queue<T> queue) {
        this.f34195a = queue;
    }

    public final int a() {
        return this.f34195a.size();
    }

    public final T b() {
        return this.f34195a.poll();
    }
}
