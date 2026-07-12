package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32830e;

    public mb1(int i2, int i3, int i4, int i5) {
        this.f32826a = i2;
        this.f32827b = i3;
        this.f32828c = i4;
        this.f32829d = i5;
        this.f32830e = i4 * i5;
    }

    public final int a() {
        return this.f32830e;
    }

    public final int b() {
        return this.f32829d;
    }

    public final int c() {
        return this.f32828c;
    }

    public final int d() {
        return this.f32826a;
    }

    public final int e() {
        return this.f32827b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb1)) {
            return false;
        }
        mb1 mb1Var = (mb1) obj;
        return this.f32826a == mb1Var.f32826a && this.f32827b == mb1Var.f32827b && this.f32828c == mb1Var.f32828c && this.f32829d == mb1Var.f32829d;
    }

    public final int hashCode() {
        return this.f32829d + ((this.f32828c + ((this.f32827b + (this.f32826a * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = sf.a("SmartCenter(x=");
        sbA.append(this.f32826a);
        sbA.append(", y=");
        sbA.append(this.f32827b);
        sbA.append(", width=");
        sbA.append(this.f32828c);
        sbA.append(", height=");
        sbA.append(this.f32829d);
        sbA.append(')');
        return sbA.toString();
    }
}
