package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ra1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34581b;

    public ra1(int i2, int i3) {
        this.f34580a = i2;
        this.f34581b = i3;
    }

    public final int a() {
        return this.f34581b;
    }

    public final int b() {
        return this.f34580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra1.class != obj.getClass()) {
            return false;
        }
        ra1 ra1Var = (ra1) obj;
        return this.f34580a == ra1Var.f34580a && this.f34581b == ra1Var.f34581b;
    }

    public final int hashCode() {
        return (this.f34580a * 31) + this.f34581b;
    }
}
