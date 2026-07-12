package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2382yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28581b;

    public C2382yd(boolean z, boolean z2) {
        this.f28580a = z;
        this.f28581b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2382yd.class != obj.getClass()) {
            return false;
        }
        C2382yd c2382yd = (C2382yd) obj;
        return this.f28580a == c2382yd.f28580a && this.f28581b == c2382yd.f28581b;
    }

    public int hashCode() {
        return ((this.f28580a ? 1 : 0) * 31) + (this.f28581b ? 1 : 0);
    }

    public String toString() {
        return "ProviderAccessFlags{lastKnownEnabled=" + this.f28580a + ", scanningEnabled=" + this.f28581b + AbstractJsonLexerKt.END_OBJ;
    }
}
