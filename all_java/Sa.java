package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Sa implements InterfaceC2402z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2402z8 f25795a;

    public Sa(Context context, D8 d8, InterfaceC2402z8 interfaceC2402z8) {
        this.f25795a = interfaceC2402z8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public int a(String str, int i2) {
        return this.f25795a.a(str, i2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public void b() {
        this.f25795a.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public long a(String str, long j2) {
        return this.f25795a.a(str, j2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public String b(String str, String str2) {
        return this.f25795a.b(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public InterfaceC2402z8 a(String str, String str2) {
        this.f25795a.a(str, str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public boolean b(String str, boolean z) {
        return this.f25795a.b(str, z);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public InterfaceC2402z8 a(String str, boolean z) {
        this.f25795a.a(str, z);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public InterfaceC2402z8 b(String str) {
        this.f25795a.b(str);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public boolean a(String str) {
        return this.f25795a.a(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public InterfaceC2402z8 b(String str, long j2) {
        this.f25795a.b(str, j2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public Set<String> a() {
        return this.f25795a.a();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2402z8
    public InterfaceC2402z8 b(String str, int i2) {
        this.f25795a.b(str, i2);
        return this;
    }
}
