package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f24420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f24421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f24422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f24423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f24424g;

    public ECommerceProduct(String str) {
        this.f24418a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f24422e;
    }

    public List<String> getCategoriesPath() {
        return this.f24420c;
    }

    public String getName() {
        return this.f24419b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f24423f;
    }

    public Map<String, String> getPayload() {
        return this.f24421d;
    }

    public List<String> getPromocodes() {
        return this.f24424g;
    }

    public String getSku() {
        return this.f24418a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f24422e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f24420c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f24419b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f24423f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f24421d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f24424g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f24418a + "', name='" + this.f24419b + "', categoriesPath=" + this.f24420c + ", payload=" + this.f24421d + ", actualPrice=" + this.f24422e + ", originalPrice=" + this.f24423f + ", promocodes=" + this.f24424g + AbstractJsonLexerKt.END_OBJ;
    }
}
