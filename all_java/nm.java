package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class nm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, mm> f33150a = new a();

    final class a extends HashMap<String, mm> {
        a() {
            put("html", mm.f32913a);
            put("native", mm.f32914b);
        }
    }

    public static mm a(Map map) {
        return (mm) ((HashMap) f33150a).get((String) map.get(z30.b(18)));
    }
}
