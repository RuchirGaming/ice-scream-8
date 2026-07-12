package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class pp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33948b;

    public pp1(int i2, int i3) {
        this.f33947a = i2;
        this.f33948b = i3;
    }

    public final int a() {
        return this.f33948b;
    }

    public final int b() {
        return this.f33947a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp1)) {
            return false;
        }
        pp1 pp1Var = (pp1) obj;
        return this.f33947a == pp1Var.f33947a && this.f33948b == pp1Var.f33948b;
    }

    public final int hashCode() {
        return this.f33948b + (this.f33947a * 31);
    }

    public final String toString() {
        StringBuilder sbA = sf.a("ViewSize(width=");
        sbA.append(this.f33947a);
        sbA.append(", height=");
        sbA.append(this.f33948b);
        sbA.append(')');
        return sbA.toString();
    }
}
