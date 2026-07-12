package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class On<T> implements Pn<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pn<T> f25491a;

    public On(Pn<T> pn, T t) {
        this.f25491a = pn;
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public T a(T t) {
        return t != this.f25491a.a(t) ? "<truncated data was not sent, see METRIKALIB-4568>" : t;
    }
}
