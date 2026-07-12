package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class y30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f36840a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f36841b;

    public final synchronized Map<String, String> a() {
        if (this.f36841b == null) {
            this.f36841b = Collections.unmodifiableMap(new HashMap(this.f36840a));
        }
        return this.f36841b;
    }
}
