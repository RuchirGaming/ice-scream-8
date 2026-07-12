package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2139p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27752b;

    public C2139p(int i2, int i3) {
        this.f27751a = i2;
        this.f27752b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2139p.class != obj.getClass()) {
            return false;
        }
        C2139p c2139p = (C2139p) obj;
        return this.f27751a == c2139p.f27751a && this.f27752b == c2139p.f27752b;
    }

    public int hashCode() {
        return (this.f27751a * 31) + this.f27752b;
    }

    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.f27751a + ", firstCollectingInappMaxAgeSeconds=" + this.f27752b + "}";
    }
}
