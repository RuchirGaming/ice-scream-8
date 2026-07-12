package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34171a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34172b;

    public final void a(Runnable runnable) {
        synchronized (this.f34171a) {
            if (this.f34172b) {
                return;
            }
            this.f34172b = true;
            runnable.run();
        }
    }
}
