package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class t50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ub1 f35419e;

    public final int a() {
        return this.f35416b;
    }

    public final String b() {
        return this.f35418d;
    }

    public final ub1 c() {
        return this.f35419e;
    }

    public final String d() {
        return this.f35417c;
    }

    public final int e() {
        return this.f35415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t50.class != obj.getClass()) {
            return false;
        }
        t50 t50Var = (t50) obj;
        if (this.f35415a != t50Var.f35415a || this.f35416b != t50Var.f35416b) {
            return false;
        }
        String str = this.f35417c;
        if (str == null ? t50Var.f35417c != null : !str.equals(t50Var.f35417c)) {
            return false;
        }
        String str2 = this.f35418d;
        if (str2 == null ? t50Var.f35418d != null : !str2.equals(t50Var.f35418d)) {
            return false;
        }
        ub1 ub1Var = this.f35419e;
        if (ub1Var != null) {
            return ub1Var.equals(t50Var.f35419e);
        }
        return t50Var.f35419e == null;
    }

    public final int hashCode() {
        int i2 = ((this.f35415a * 31) + this.f35416b) * 31;
        String str = this.f35417c;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35418d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ub1 ub1Var = this.f35419e;
        return iHashCode2 + (ub1Var != null ? ub1Var.hashCode() : 0);
    }

    public final void a(int i2) {
        this.f35416b = i2;
    }

    public final void b(int i2) {
        this.f35415a = i2;
    }

    public final void a(String str) {
        this.f35418d = str;
    }

    public final void b(String str) {
        this.f35417c = str;
    }

    public final void a(ub1 ub1Var) {
        this.f35419e = ub1Var;
    }
}
