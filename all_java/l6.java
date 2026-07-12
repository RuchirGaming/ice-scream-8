package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32513a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32514b = 1;

    public final int a() {
        int i2;
        synchronized (this.f32513a) {
            i2 = this.f32514b;
        }
        return i2;
    }

    public final void a(int i2) {
        synchronized (this.f32513a) {
            this.f32514b = i2;
        }
    }
}
