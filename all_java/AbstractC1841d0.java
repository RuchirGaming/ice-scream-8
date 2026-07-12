package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class AbstractC1841d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC1841d0<T> f26678a;

    public AbstractC1841d0(AbstractC1841d0<T> abstractC1841d0) {
        this.f26678a = abstractC1841d0;
    }

    public void a(T t) {
        b(t);
        AbstractC1841d0<T> abstractC1841d0 = this.f26678a;
        if (abstractC1841d0 != null) {
            abstractC1841d0.a(t);
        }
    }

    public abstract void b(T t);
}
