package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class zr0 implements es0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f37413a = new CopyOnWriteArrayList();

    public final void a(es0 es0Var) {
        this.f37413a.add(es0Var);
    }

    public final void b(es0 es0Var) {
        this.f37413a.remove(es0Var);
    }

    @Override // com.yandex.mobile.ads.impl.es0
    public final void a() {
        Iterator it = this.f37413a.iterator();
        while (it.hasNext()) {
            ((es0) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.es0
    public final void b() {
        Iterator it = this.f37413a.iterator();
        while (it.hasNext()) {
            ((es0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.es0
    public final void a(long j2, long j3) {
        Iterator it = this.f37413a.iterator();
        while (it.hasNext()) {
            ((es0) it.next()).a(j2, j3);
        }
    }
}
