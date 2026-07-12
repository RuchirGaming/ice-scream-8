package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class fl<T extends View> implements ea<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ea<T>> f30788a;

    public fl(List<ea<T>> list) {
        this.f30788a = list;
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final void a(T t) {
        Iterator<ea<T>> it = this.f30788a.iterator();
        while (it.hasNext()) {
            it.next().a(t);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final void cancel() {
        Iterator<ea<T>> it = this.f30788a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
