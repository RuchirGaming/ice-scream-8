package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24637b;

    public Ci(int i2, int i3) {
        this.f24636a = i2;
        this.f24637b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ci.class != obj.getClass()) {
            return false;
        }
        Ci ci = (Ci) obj;
        return this.f24636a == ci.f24636a && this.f24637b == ci.f24637b;
    }

    public int hashCode() {
        return (this.f24636a * 31) + this.f24637b;
    }

    public String toString() {
        return "RetryPolicyConfig{maxIntervalSeconds=" + this.f24636a + ", exponentialMultiplier=" + this.f24637b + AbstractJsonLexerKt.END_OBJ;
    }
}
