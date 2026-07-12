package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2382yd f24761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dc f24762b;

    public Ec(C2382yd c2382yd, Dc dc) {
        this.f24761a = c2382yd;
        this.f24762b = dc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ec.class != obj.getClass()) {
            return false;
        }
        Ec ec = (Ec) obj;
        if (!this.f24761a.equals(ec.f24761a)) {
            return false;
        }
        Dc dc = this.f24762b;
        Dc dc2 = ec.f24762b;
        if (dc != null) {
            return dc.equals(dc2);
        }
        return dc2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f24761a.hashCode() * 31;
        Dc dc = this.f24762b;
        return iHashCode + (dc != null ? dc.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f24761a + ", arguments=" + this.f24762b + AbstractJsonLexerKt.END_OBJ;
    }
}
