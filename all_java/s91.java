package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class s91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f35012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35014d;

    public final void a(String str) {
        this.f35011a = str;
    }

    public final Long b() {
        return this.f35012b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s91.class != obj.getClass()) {
            return false;
        }
        s91 s91Var = (s91) obj;
        if (this.f35013c != s91Var.f35013c || this.f35014d != s91Var.f35014d) {
            return false;
        }
        String str = this.f35011a;
        if (str == null ? s91Var.f35011a != null : !str.equals(s91Var.f35011a)) {
            return false;
        }
        Long l2 = this.f35012b;
        if (l2 != null) {
            return l2.equals(s91Var.f35012b);
        }
        return s91Var.f35012b == null;
    }

    public final int hashCode() {
        String str = this.f35011a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.f35012b;
        return ((((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f35013c ? 1 : 0)) * 31) + (this.f35014d ? 1 : 0);
    }

    public final void a(boolean z) {
        this.f35013c = z;
    }

    public final void b(boolean z) {
        this.f35014d = z;
    }

    public final void a(Long l2) {
        this.f35012b = l2;
    }

    public final boolean a() {
        return this.f35014d;
    }
}
