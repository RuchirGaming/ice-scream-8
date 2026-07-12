package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class n80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f33039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33041d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f33042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f33043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f33044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f33045d;

        public final a a(float f2) {
            this.f33043b = f2;
            return this;
        }

        public final a b(boolean z) {
            this.f33042a = z;
            return this;
        }

        public final void a(boolean z) {
            this.f33044c = z;
        }

        public final void b(float f2) {
            this.f33045d = f2;
        }

        public final n80 a() {
            return new n80(this, 0);
        }
    }

    /* synthetic */ n80(a aVar, int i2) {
        this(aVar);
    }

    public final float a() {
        return this.f33039b;
    }

    public final float b() {
        return this.f33041d;
    }

    public final boolean c() {
        return this.f33040c;
    }

    public final boolean d() {
        return this.f33038a;
    }

    private n80(a aVar) {
        this.f33038a = aVar.f33042a;
        this.f33039b = aVar.f33043b;
        this.f33040c = aVar.f33044c;
        this.f33041d = aVar.f33045d;
    }
}
