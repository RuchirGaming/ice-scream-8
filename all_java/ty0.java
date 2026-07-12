package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f35615c;

    public ty0(String str, String str2, HashMap map) {
        this.f35613a = str;
        this.f35614b = str2;
        this.f35615c = map;
    }

    public final Map<String, Object> a() {
        return this.f35615c;
    }

    public final String b() {
        return this.f35613a;
    }

    public final String c() {
        return this.f35614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty0.class != obj.getClass()) {
            return false;
        }
        ty0 ty0Var = (ty0) obj;
        if (!this.f35613a.equals(ty0Var.f35613a) || !this.f35614b.equals(ty0Var.f35614b)) {
            return false;
        }
        Map<String, Object> map = this.f35615c;
        Map<String, Object> map2 = ty0Var.f35615c;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public final int hashCode() {
        int iA = y2.a(this.f35614b, this.f35613a.hashCode() * 31, 31);
        Map<String, Object> map = this.f35615c;
        return iA + (map != null ? map.hashCode() : 0);
    }
}
