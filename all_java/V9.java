package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class V9<T> implements W9<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W9<T> f26024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1889en f26025b;

    public V9(W9<T> w9, C1889en c1889en) {
        this.f26024a = w9;
        this.f26025b = c1889en;
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public byte[] a(T t) {
        try {
            return this.f26025b.a(this.f26024a.a(t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a(byte[] bArr) throws IOException {
        try {
            C1889en c1889en = this.f26025b;
            c1889en.getClass();
            return this.f26024a.a(c1889en.a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a() {
        return this.f26024a.a();
    }
}
