package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f32806a;

    public mb(float f2) {
        this.f32806a = f2 == 0.0f ? 1.7777778f : f2;
    }

    public final int a(int i2) {
        return Math.round(i2 / this.f32806a);
    }

    public final int b(int i2) {
        return Math.round(i2 * this.f32806a);
    }
}
