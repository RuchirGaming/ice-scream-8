package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2317vn extends Thread implements InterfaceC2262tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f28421a;

    public C2317vn() {
        this.f28421a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2262tn
    public synchronized boolean c() {
        return this.f28421a;
    }

    public synchronized void d() {
        this.f28421a = false;
        interrupt();
    }

    public C2317vn(Runnable runnable, String str) {
        super(runnable, str);
        this.f28421a = true;
    }

    public C2317vn(String str) {
        super(str);
        this.f28421a = true;
    }
}
