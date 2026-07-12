package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum f7 {
    f30645b("banner"),
    f30646c("interstitial"),
    f30647d("rewarded"),
    f30648e("native"),
    f30649f("vastvideo"),
    f30650g("instream"),
    f30651h("appopenad");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30653a;

    f7(String str) {
        this.f30653a = str;
    }

    public final String a() {
        return this.f30653a;
    }

    public static f7 a(String str) {
        for (f7 f7Var : values()) {
            if (f7Var.f30653a.equals(str)) {
                return f7Var;
            }
        }
        return null;
    }
}
