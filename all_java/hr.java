package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n80 f31401a;

    public hr(yx0 yx0Var) {
        n80.a aVar = new n80.a();
        float volume = yx0Var.getVolume();
        if (volume == 0.0f) {
            aVar.a(1.0f);
            aVar.b(true);
        } else {
            aVar.a(volume);
            aVar.b(false);
        }
        this.f31401a = aVar.a();
    }

    final n80 a() {
        return this.f31401a;
    }
}
