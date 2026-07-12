package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Gf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f24948c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<HashMap<String, C1782ag.a>> f24949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24950b;

    public Gf() {
        this(f24948c);
    }

    public C1782ag.a a(int i2, String str) {
        return this.f24949a.get(i2).get(str);
    }

    public void b() {
        this.f24950b++;
    }

    public C1782ag c() {
        C1782ag c1782ag = new C1782ag();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f24949a.size(); i2++) {
            SparseArray<HashMap<String, C1782ag.a>> sparseArray = this.f24949a;
            Iterator<C1782ag.a> it = sparseArray.get(sparseArray.keyAt(i2)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c1782ag.f26528b = (C1782ag.a[]) arrayList.toArray(new C1782ag.a[arrayList.size()]);
        return c1782ag;
    }

    Gf(int[] iArr) {
        this.f24949a = new SparseArray<>();
        this.f24950b = 0;
        for (int i2 : iArr) {
            this.f24949a.put(i2, new HashMap<>());
        }
    }

    void a(C1782ag.a aVar) {
        this.f24949a.get(aVar.f26531c).put(new String(aVar.f26530b), aVar);
    }

    public int a() {
        return this.f24950b;
    }
}
