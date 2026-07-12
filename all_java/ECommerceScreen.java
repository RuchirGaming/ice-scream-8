package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f24429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f24431d;

    public List<String> getCategoriesPath() {
        return this.f24429b;
    }

    public String getName() {
        return this.f24428a;
    }

    public Map<String, String> getPayload() {
        return this.f24431d;
    }

    public String getSearchQuery() {
        return this.f24430c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f24429b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f24428a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f24431d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f24430c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f24428a + "', categoriesPath=" + this.f24429b + ", searchQuery='" + this.f24430c + "', payload=" + this.f24431d + AbstractJsonLexerKt.END_OBJ;
    }
}
