package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Zm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<K, Collection<V>> f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26491b;

    public Zm() {
        this(false);
    }

    public Collection<V> a(K k2) {
        return this.f26490a.get(k2);
    }

    public boolean b() {
        return this.f26490a.isEmpty();
    }

    public int c() {
        Iterator<Collection<V>> it = this.f26490a.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return this.f26490a.toString();
    }

    public Zm(boolean z) {
        this.f26490a = new HashMap<>();
        this.f26491b = z;
    }

    public Collection<V> a(K k2, V v) {
        Collection<V> collection = this.f26490a.get(k2);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(v);
        return this.f26490a.put(k2, arrayList);
    }

    public Collection<V> b(K k2) {
        return this.f26490a.remove(k2);
    }

    public Collection<V> b(K k2, V v) {
        Collection<V> collection = this.f26490a.get(k2);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f26491b) {
            this.f26490a.remove(k2);
        }
        return new ArrayList(collection);
    }

    public Set<? extends Map.Entry<K, ? extends Collection<V>>> a() {
        return this.f26490a.entrySet();
    }
}
