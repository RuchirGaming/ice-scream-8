package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class um<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35827a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f35828b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f35829c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f35830d = Collections.emptyList();

    public final void a(E e2) {
        synchronized (this.f35827a) {
            ArrayList arrayList = new ArrayList(this.f35830d);
            arrayList.add(e2);
            this.f35830d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f35828b.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f35829c);
                hashSet.add(e2);
                this.f35829c = Collections.unmodifiableSet(hashSet);
            }
            this.f35828b.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public final int b(E e2) {
        int iIntValue;
        synchronized (this.f35827a) {
            iIntValue = this.f35828b.containsKey(e2) ? ((Integer) this.f35828b.get(e2)).intValue() : 0;
        }
        return iIntValue;
    }

    public final void c(E e2) {
        synchronized (this.f35827a) {
            Integer num = (Integer) this.f35828b.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f35830d);
            arrayList.remove(e2);
            this.f35830d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f35828b.remove(e2);
                HashSet hashSet = new HashSet(this.f35829c);
                hashSet.remove(e2);
                this.f35829c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f35828b.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f35827a) {
            it = this.f35830d.iterator();
        }
        return it;
    }

    public final Set<E> a() {
        Set<E> set;
        synchronized (this.f35827a) {
            set = this.f35829c;
        }
        return set;
    }
}
