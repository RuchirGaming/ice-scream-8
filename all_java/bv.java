package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29480b;

    public bv(int i2, String str) {
        this.f29479a = str;
        this.f29480b = i2;
    }

    public final String a() {
        return this.f29479a;
    }

    public final int b() {
        return this.f29480b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bv.class != obj.getClass()) {
            return false;
        }
        bv bvVar = (bv) obj;
        if (this.f29480b != bvVar.f29480b) {
            return false;
        }
        return this.f29479a.equals(bvVar.f29479a);
    }

    public final int hashCode() {
        return (this.f29479a.hashCode() * 31) + this.f29480b;
    }
}
