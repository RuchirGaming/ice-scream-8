package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37293a;

    public void b() {
        this.f37293a = 0;
    }

    public final void c() {
        this.f37293a &= Integer.MAX_VALUE;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return c(4);
    }

    public final boolean g() {
        return c(1);
    }

    public final void b(int i2) {
        this.f37293a = i2 | this.f37293a;
    }

    protected final boolean c(int i2) {
        return (this.f37293a & i2) == i2;
    }

    public final void d(int i2) {
        this.f37293a = i2;
    }
}
