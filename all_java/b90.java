package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class b90 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f29289d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile b90 f29290e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29291a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29292b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29293c = true;

    private b90() {
    }

    public static b90 a() {
        if (f29290e == null) {
            synchronized (f29289d) {
                if (f29290e == null) {
                    f29290e = new b90();
                }
            }
        }
        return f29290e;
    }

    public final void b(boolean z) {
        this.f29291a = z;
    }

    public final boolean c() {
        return this.f29291a;
    }

    public final boolean d() {
        return this.f29292b;
    }

    public final boolean b() {
        return this.f29293c;
    }

    public final void c(boolean z) {
        this.f29292b = z;
    }

    public final void a(boolean z) {
        this.f29293c = z;
    }
}
