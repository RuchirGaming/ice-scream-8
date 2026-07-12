package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35398b;

    public t3(int i2, int i3) {
        this.f35397a = i2;
        this.f35398b = i3;
    }

    public final int a() {
        return this.f35397a;
    }

    public final int b() {
        return this.f35398b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t3.class != obj.getClass()) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return this.f35397a == t3Var.f35397a && this.f35398b == t3Var.f35398b;
    }

    public final int hashCode() {
        return (this.f35397a * 31) + this.f35398b;
    }
}
