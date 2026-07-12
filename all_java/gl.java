package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gl<V extends ViewGroup> implements fs<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fs<V>[] f31063a;

    @SafeVarargs
    public gl(fs<V>... fsVarArr) {
        this.f31063a = fsVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.fs
    public final void a(V v) {
        for (fs<V> fsVar : this.f31063a) {
            fsVar.a(v);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fs
    public final void c() {
        for (fs<V> fsVar : this.f31063a) {
            fsVar.c();
        }
    }
}
