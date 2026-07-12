package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class h91 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h91 f31237c = new h91(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31239b;

    public h91(long j2, long j3) {
        this.f31238a = j2;
        this.f31239b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h91.class != obj.getClass()) {
            return false;
        }
        h91 h91Var = (h91) obj;
        return this.f31238a == h91Var.f31238a && this.f31239b == h91Var.f31239b;
    }

    public final int hashCode() {
        return (((int) this.f31238a) * 31) + ((int) this.f31239b);
    }

    public final String toString() {
        StringBuilder sbA = sf.a("[timeUs=");
        sbA.append(this.f31238a);
        sbA.append(", position=");
        sbA.append(this.f31239b);
        sbA.append(com.ironsource.sdk.constants.a.i.f17749e);
        return sbA.toString();
    }
}
