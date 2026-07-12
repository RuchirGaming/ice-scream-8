package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37124d;

    public z2(int i2, String str, String str2) {
        this(i2, str, str2, null);
    }

    public final String a() {
        return this.f37124d;
    }

    public final int b() {
        return this.f37123c;
    }

    public final String c() {
        return this.f37122b;
    }

    public final String d() {
        return this.f37121a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z2.class != obj.getClass()) {
            return false;
        }
        z2 z2Var = (z2) obj;
        if (this.f37123c == z2Var.f37123c && this.f37122b.equals(z2Var.f37122b) && Objects.equals(this.f37124d, z2Var.f37124d)) {
            return this.f37121a.equals(z2Var.f37121a);
        }
        return false;
    }

    public final int hashCode() {
        int iA = (y2.a(this.f37121a, this.f37122b.hashCode() * 31, 31) + this.f37123c) * 31;
        String str = this.f37124d;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Integer.valueOf(this.f37123c), this.f37122b, this.f37124d, this.f37121a);
    }

    public z2(int i2, String str, String str2, String str3) {
        this.f37123c = i2;
        this.f37122b = str;
        this.f37121a = str2;
        this.f37124d = str3;
    }
}
