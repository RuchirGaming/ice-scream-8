package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class w10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36241b;

    public w10(String str, String str2) {
        this.f36240a = str;
        this.f36241b = str2;
    }

    public final String a() {
        return this.f36240a;
    }

    public final String b() {
        return this.f36241b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w10.class != obj.getClass()) {
            return false;
        }
        w10 w10Var = (w10) obj;
        return TextUtils.equals(this.f36240a, w10Var.f36240a) && TextUtils.equals(this.f36241b, w10Var.f36241b);
    }

    public final int hashCode() {
        return this.f36241b.hashCode() + (this.f36240a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = sf.a("Header[name=");
        sbA.append(this.f36240a);
        sbA.append(",value=");
        sbA.append(this.f36241b);
        sbA.append(com.ironsource.sdk.constants.a.i.f17749e);
        return sbA.toString();
    }
}
