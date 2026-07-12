package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class so1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35224a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35225b = 1;

    public final int a() {
        int i2;
        synchronized (this.f35224a) {
            i2 = this.f35225b;
        }
        return i2;
    }

    public final void a(int i2) {
        synchronized (this.f35224a) {
            this.f35225b = i2;
        }
    }
}
