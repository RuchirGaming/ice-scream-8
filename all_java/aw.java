package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
abstract class aw<F, T> implements Iterator<T> {
    final Iterator<? extends F> ri;

    abstract T A(F f2);

    aw(Iterator<? extends F> it) {
        this.ri = (Iterator) Preconditions.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.ri.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return A(this.ri.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.ri.remove();
    }
}
