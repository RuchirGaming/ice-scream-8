package com.applovin.exoplayer2.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class i<E> implements Iterable<E> {
    private final Object rT = new Object();
    private final Map<E, Integer> abR = new HashMap();
    private Set<E> abS = Collections.emptySet();
    private List<E> abT = Collections.emptyList();

    public void add(E e2) {
        synchronized (this.rT) {
            ArrayList arrayList = new ArrayList(this.abT);
            arrayList.add(e2);
            this.abT = Collections.unmodifiableList(arrayList);
            Integer num = this.abR.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.abS);
                hashSet.add(e2);
                this.abS = Collections.unmodifiableSet(hashSet);
            }
            this.abR.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void O(E e2) {
        synchronized (this.rT) {
            Integer num = this.abR.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.abT);
            arrayList.remove(e2);
            this.abT = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.abR.remove(e2);
                HashSet hashSet = new HashSet(this.abS);
                hashSet.remove(e2);
                this.abS = Collections.unmodifiableSet(hashSet);
            } else {
                this.abR.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public Set<E> gN() {
        Set<E> set;
        synchronized (this.rT) {
            set = this.abS;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.rT) {
            it = this.abT.iterator();
        }
        return it;
    }

    public int P(E e2) {
        int iIntValue;
        synchronized (this.rT) {
            iIntValue = this.abR.containsKey(e2) ? this.abR.get(e2).intValue() : 0;
        }
        return iIntValue;
    }
}
