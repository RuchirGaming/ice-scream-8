package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class eq1 implements db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30533a;

    public eq1(boolean z) {
        this.f30533a = a(z);
    }

    static boolean a(boolean z) {
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final String a() {
        return String.format("viewable: %s", Boolean.valueOf(this.f30533a));
    }
}
