package com.yandex.mobile.ads.impl;

import androidx.credentials.webauthn.Cbor$Arg$$ExternalSyntheticBackport0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37146a;

    public z4(long j2) {
        this.f37146a = j2;
    }

    public final long a() {
        return this.f37146a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4) && this.f37146a == ((z4) obj).f37146a;
    }

    public final int hashCode() {
        return Cbor$Arg$$ExternalSyntheticBackport0.m(this.f37146a);
    }

    public final String toString() {
        StringBuilder sbA = sf.a("AdPodItem(duration=");
        sbA.append(this.f37146a);
        sbA.append(')');
        return sbA.toString();
    }
}
