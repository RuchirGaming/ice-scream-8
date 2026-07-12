package com.yandex.metrica.impl.ob;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Xm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f26309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26315g;

    public Xm(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f26311c = i2;
        this.f26309a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int b(K k2, V v) {
        int length = O2.c(((Xk) k2).f26307b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k2 + com.ironsource.sdk.constants.a.i.f17746b + v);
    }

    public final synchronized V a(K k2) {
        V v = this.f26309a.get(k2);
        if (v != null) {
            this.f26314f++;
            return v;
        }
        this.f26315g++;
        return null;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f26314f;
        i3 = this.f26315g + i2;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f26311c), Integer.valueOf(this.f26314f), Integer.valueOf(this.f26315g), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    public final synchronized V a(K k2, V v) {
        V vPut;
        this.f26312d++;
        this.f26310b += b(k2, v);
        vPut = this.f26309a.put(k2, v);
        if (vPut != null) {
            this.f26310b -= b(k2, vPut);
        }
        a(this.f26311c);
        return vPut;
    }

    private void a(int i2) {
        Map.Entry<K, V> next;
        while (this.f26310b > i2 && !this.f26309a.isEmpty() && (next = this.f26309a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f26309a.remove(key);
            this.f26310b -= b(key, value);
            this.f26313e++;
        }
        if (this.f26310b < 0 || (this.f26309a.isEmpty() && this.f26310b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized void a() {
        a(-1);
    }
}
