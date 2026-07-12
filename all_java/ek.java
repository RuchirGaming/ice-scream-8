package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30475b;

    public ek(int i2, String str) {
        this.f30475b = i2;
        this.f30474a = str;
    }

    public final String a() {
        return this.f30474a;
    }

    public final int b() {
        return this.f30475b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ek.class != obj.getClass()) {
            return false;
        }
        ek ekVar = (ek) obj;
        String str = this.f30474a;
        if (str == null ? ekVar.f30474a == null : str.equals(ekVar.f30474a)) {
            return this.f30475b == ekVar.f30475b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30474a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.f30475b;
        return iHashCode + (i2 != 0 ? q6.a(i2) : 0);
    }
}
