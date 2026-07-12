package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class be1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile be1 f29321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f29322c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f29323a = new HashMap();

    private be1() {
    }

    public static be1 a() {
        if (f29321b == null) {
            synchronized (f29322c) {
                if (f29321b == null) {
                    f29321b = new be1();
                }
            }
        }
        return f29321b;
    }

    public final void b(gb0 gb0Var, Object obj) {
        synchronized (f29322c) {
            Set hashSet = (Set) this.f29323a.get(gb0Var);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f29323a.put(gb0Var, hashSet);
            }
            hashSet.add(obj);
        }
    }

    public final void a(gb0 gb0Var, Object obj) {
        synchronized (f29322c) {
            Set set = (Set) this.f29323a.get(gb0Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }
}
