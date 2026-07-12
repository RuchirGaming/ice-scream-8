package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class cw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f29903a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f29904b = "goog.exo.core";

    public static synchronized String a() {
        return f29904b;
    }

    public static synchronized void a(String str) {
        if (f29903a.add(str)) {
            f29904b += ", " + str;
        }
    }
}
