package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kz implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<lz> f32375a;

    public final void a(lz lzVar) {
        this.f32375a = new WeakReference<>(lzVar);
    }

    @Override // com.yandex.mobile.ads.impl.lz
    public final void f() {
        lz lzVar;
        WeakReference<lz> weakReference = this.f32375a;
        if (weakReference == null || (lzVar = weakReference.get()) == null) {
            return;
        }
        lzVar.f();
    }
}
