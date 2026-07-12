package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class f21 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f21 f30615b = new f21(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30616a;

    public f21(boolean z) {
        this.f30616a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f21.class == obj.getClass() && this.f30616a == ((f21) obj).f30616a;
    }

    public final int hashCode() {
        return !this.f30616a ? 1 : 0;
    }
}
