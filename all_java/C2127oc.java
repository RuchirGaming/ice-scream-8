package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2127oc implements InterfaceC2102nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27730c = 0;

    public C2127oc(int i2, int i3) {
        this.f27728a = i2;
        this.f27729b = i3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2102nc
    public int a() {
        return this.f27729b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2102nc
    public boolean b() {
        int i2 = this.f27730c;
        this.f27730c = i2 + 1;
        return i2 < this.f27728a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2102nc
    public void c() {
        this.f27730c = 0;
    }
}
