package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum wp1 implements db0 {
    f36423b("default"),
    f36424c("loading"),
    f36425d("hidden");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36427a;

    wp1(String str) {
        this.f36427a = str;
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final String a() {
        return String.format("state: %s", JSONObject.quote(this.f36427a));
    }
}
