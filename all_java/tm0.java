package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class tm0 implements t21.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t21.b f35537c;

    public tm0(String str, String str2, t21.b bVar) {
        this.f35535a = str;
        this.f35536b = str2;
        this.f35537c = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.t21.b
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("asset_name", this.f35535a);
        map.put("action_type", this.f35536b);
        t21.b bVar = this.f35537c;
        if (bVar != null) {
            map.putAll(bVar.a());
        }
        return map;
    }
}
