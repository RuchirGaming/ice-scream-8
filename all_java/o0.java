package com.monetization.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.py0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
abstract class o0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f23334a;

    o0(Iterator<? extends F> it) {
        this.f23334a = (Iterator) py0.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23334a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f23334a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23334a.remove();
    }
}
