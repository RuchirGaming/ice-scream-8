package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1980ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27119b;

    public C1980ie(String str, boolean z) {
        this.f27118a = str;
        this.f27119b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1980ie.class != obj.getClass()) {
            return false;
        }
        C1980ie c1980ie = (C1980ie) obj;
        if (this.f27119b != c1980ie.f27119b) {
            return false;
        }
        return this.f27118a.equals(c1980ie.f27118a);
    }

    public int hashCode() {
        return (this.f27118a.hashCode() * 31) + (this.f27119b ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.f27118a + "', granted=" + this.f27119b + AbstractJsonLexerKt.END_OBJ;
    }
}
