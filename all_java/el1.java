package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class el1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30500a;

    el1(int i2, String str) {
        this(str);
    }

    public static el1 a() {
        return new el1("Internal error. Failed to parse response");
    }

    public static el1 b() {
        return new el1("Server temporarily unavailable. Please, try again later.");
    }

    public final String c() {
        return this.f30500a;
    }

    private el1(String str) {
        this.f30500a = str;
    }

    public static el1 a(xu xuVar) {
        return new el1(xuVar.getMessage() != null ? xuVar.getMessage() : "Ad request completed successfully, but there are no ads available.");
    }

    public static el1 b(String str) {
        return new el1(str);
    }

    public static el1 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new el1(str);
    }
}
