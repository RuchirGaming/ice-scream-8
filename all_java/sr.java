package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f35289d;

    public sr() {
        this(1.0f, 2500, 1);
    }

    public final int a() {
        return this.f35286a;
    }

    public sr(float f2, int i2, int i3) {
        this.f35286a = i2;
        this.f35288c = i3;
        this.f35289d = f2;
    }

    public final void a(uq1 uq1Var) throws uq1 {
        int i2 = this.f35287b + 1;
        this.f35287b = i2;
        int i3 = this.f35286a;
        this.f35286a = i3 + ((int) (i3 * this.f35289d));
        if (!(i2 <= this.f35288c)) {
            throw uq1Var;
        }
    }
}
