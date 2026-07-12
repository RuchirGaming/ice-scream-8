package com.yandex.metrica.ecommerce;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f24416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ECommerceAmount> f24417b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f24416a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f24416a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f24417b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f24417b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f24416a + ", internalComponents=" + this.f24417b + AbstractJsonLexerKt.END_OBJ;
    }
}
