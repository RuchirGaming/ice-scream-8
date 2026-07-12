package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<String> f24851a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f24851a = sparseArray;
        sparseArray.put(0, "String");
        f24851a.put(1, "Number");
        f24851a.put(2, "Counter");
    }

    static String a(int i2) {
        return f24851a.get(i2);
    }
}
