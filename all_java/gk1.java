package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.models.ad.JavaScriptResource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gk1 implements vo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaScriptResource f31060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f31062d;

    public gk1(String str, JavaScriptResource javaScriptResource, String str2, HashMap map) {
        this.f31059a = str;
        this.f31060b = javaScriptResource;
        this.f31061c = str2;
        this.f31062d = map;
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.f31062d);
    }

    public final JavaScriptResource b() {
        return this.f31060b;
    }

    public final String c() {
        return this.f31061c;
    }

    public final String d() {
        return this.f31059a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk1.class != obj.getClass()) {
            return false;
        }
        gk1 gk1Var = (gk1) obj;
        if (!this.f31059a.equals(gk1Var.f31059a)) {
            return false;
        }
        JavaScriptResource javaScriptResource = this.f31060b;
        if (javaScriptResource == null ? gk1Var.f31060b != null : !javaScriptResource.equals(gk1Var.f31060b)) {
            return false;
        }
        String str = this.f31061c;
        if (str == null ? gk1Var.f31061c == null : str.equals(gk1Var.f31061c)) {
            return this.f31062d.equals(gk1Var.f31062d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f31059a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f31060b;
        int iHashCode2 = (iHashCode + (javaScriptResource != null ? javaScriptResource.hashCode() : 0)) * 31;
        String str = this.f31061c;
        return this.f31062d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
