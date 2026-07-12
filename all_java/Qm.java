package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum Qm {
    LOGIN("login"),
    LOGOUT("logout"),
    SWITCH("switch"),
    UPDATE("update");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25645a;

    Qm(String str) {
        this.f25645a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25645a;
    }
}
