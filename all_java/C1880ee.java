package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class C1880ee implements InterfaceC1855de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26837a;

    C1880ee(boolean z) {
        this.f26837a = z;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1855de
    public boolean a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f26837a;
        }
        return true;
    }

    public String toString() {
        return "LocationFlagStrategy{mEnabled=" + this.f26837a + AbstractJsonLexerKt.END_OBJ;
    }
}
