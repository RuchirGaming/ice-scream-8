package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class x91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36650c;

    public final void a(long j2) {
        this.f36648a = j2;
    }

    public final String b() {
        return this.f36649b;
    }

    public final int c() {
        return this.f36650c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x91.class != obj.getClass()) {
            return false;
        }
        x91 x91Var = (x91) obj;
        if (this.f36648a != x91Var.f36648a || this.f36650c != x91Var.f36650c) {
            return false;
        }
        String str = this.f36649b;
        String str2 = x91Var.f36649b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        long j2 = this.f36648a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f36649b;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f36650c;
    }

    public final void a(String str) {
        this.f36649b = str;
    }

    public final void a(int i2) {
        this.f36650c = i2;
    }

    public final long a() {
        return this.f36648a;
    }
}
