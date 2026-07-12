package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f35666a;

    public u21(Map<String, Object> map) {
        this.f35666a = map;
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            a(str);
        } else {
            this.f35666a.put(str, obj);
        }
    }

    public final void a(List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f35666a.put("active_experiments", list);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f35666a.put(str, obj);
        }
    }

    public final void a(String str) {
        this.f35666a.put(str, AdError.UNDEFINED_DOMAIN);
    }

    public final void a(Map<String, Object> map) {
        this.f35666a.putAll(map);
    }

    public final Map<String, Object> a() {
        return this.f35666a;
    }
}
