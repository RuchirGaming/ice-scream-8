package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class v60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36008c;

    public v60(int i2, int i3, String str) {
        this.f36006a = str;
        this.f36007b = i2;
        this.f36008c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v60.class != obj.getClass()) {
            return false;
        }
        v60 v60Var = (v60) obj;
        if (this.f36007b == v60Var.f36007b && this.f36008c == v60Var.f36008c) {
            return this.f36006a.equals(v60Var.f36006a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f36006a.hashCode() * 31) + this.f36007b) * 31) + this.f36008c;
    }
}
