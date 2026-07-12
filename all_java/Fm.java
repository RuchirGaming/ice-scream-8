package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Fm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f24870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f24871b;

    public Fm(V v) {
        this(new HashMap(), v);
    }

    public void a(K k2, V v) {
        this.f24870a.put(k2, v);
    }

    public Fm(Map<K, V> map, V v) {
        this.f24870a = map;
        this.f24871b = v;
    }

    public V a(K k2) {
        V v = this.f24870a.get(k2);
        return v == null ? this.f24871b : v;
    }

    public Set<K> a() {
        return this.f24870a.keySet();
    }
}
