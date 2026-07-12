package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.do, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class Cdo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f26759a;

    public Cdo(T t) {
        this.f26759a = t;
    }

    protected abstract boolean a(Cdo<T> cdo);

    public boolean equals(Object obj) {
        if (obj instanceof Cdo) {
            try {
                return a((Cdo) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
