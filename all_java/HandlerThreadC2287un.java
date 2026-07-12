package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class HandlerThreadC2287un extends HandlerThread implements InterfaceC2262tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f28277a;

    public HandlerThreadC2287un(String str) {
        super(str);
        this.f28277a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2262tn
    public synchronized boolean c() {
        return this.f28277a;
    }
}
