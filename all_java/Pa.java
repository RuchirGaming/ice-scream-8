package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Pa implements InterfaceC2377y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2377y8 f25527a;

    Pa(Context context, D8 d8, InterfaceC2377y8 interfaceC2377y8) {
        this.f25527a = interfaceC2377y8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2377y8
    public void a(String str, byte[] bArr) {
        this.f25527a.a(str, bArr);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2377y8
    public void b(String str) {
        this.f25527a.b(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2377y8
    public byte[] a(String str) {
        return this.f25527a.a(str);
    }
}
