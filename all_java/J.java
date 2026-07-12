package com.unity3d.player;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f23925e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23926a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23927b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23928c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23929d = false;

    J() {
    }

    static boolean d() {
        return f23925e;
    }

    static void e() {
        f23925e = true;
    }

    static void f() {
        f23925e = false;
    }

    boolean a() {
        return this.f23929d;
    }

    boolean a(boolean z) {
        return f23925e && !((!z && !this.f23926a) || this.f23928c || this.f23927b);
    }

    void b(boolean z) {
        this.f23926a = z;
    }

    boolean b() {
        return this.f23928c;
    }

    void c(boolean z) {
        this.f23927b = z;
    }

    boolean c() {
        return this.f23927b;
    }

    void d(boolean z) {
        this.f23929d = z;
    }

    void e(boolean z) {
        this.f23928c = z;
    }

    public String toString() {
        return super.toString();
    }
}
