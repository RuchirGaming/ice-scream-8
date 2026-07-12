package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1947h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<Integer> f27035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27037d;

    public C1947h6() {
        this(false, 0, 0, new HashSet());
    }

    public void a() {
        this.f27035b = new HashSet();
        this.f27037d = 0;
    }

    public Set<Integer> b() {
        return this.f27035b;
    }

    public int c() {
        return this.f27037d;
    }

    public int d() {
        return this.f27036c;
    }

    public boolean e() {
        return this.f27034a;
    }

    public C1947h6(boolean z, int i2, int i3, Set<Integer> set) {
        this.f27034a = z;
        this.f27035b = set;
        this.f27036c = i2;
        this.f27037d = i3;
    }

    public void b(int i2) {
        this.f27036c = i2;
        this.f27037d = 0;
    }

    public void a(boolean z) {
        this.f27034a = z;
    }

    public void a(int i2) {
        this.f27035b.add(Integer.valueOf(i2));
        this.f27037d++;
    }
}
