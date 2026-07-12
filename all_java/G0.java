package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24875a;

    public G0(long j2) {
        this.f24875a = j2;
    }

    public final long a() {
        return this.f24875a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof G0) && this.f24875a == ((G0) obj).f24875a;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.f24875a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return "EasyCollectingConfig(firstLaunchDelaySeconds=" + this.f24875a + ")";
    }
}
