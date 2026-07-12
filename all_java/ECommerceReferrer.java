package com.yandex.metrica.ecommerce;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f24427c;

    public String getIdentifier() {
        return this.f24426b;
    }

    public ECommerceScreen getScreen() {
        return this.f24427c;
    }

    public String getType() {
        return this.f24425a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f24426b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f24427c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f24425a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f24425a + "', identifier='" + this.f24426b + "', screen=" + this.f24427c + AbstractJsonLexerKt.END_OBJ;
    }
}
