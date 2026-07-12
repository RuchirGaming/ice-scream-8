package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1873e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2072m7 f26804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C2072m7> f26805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26806c;

    public C1873e7(C2072m7 c2072m7, List<C2072m7> list, String str) {
        this.f26804a = c2072m7;
        this.f26805b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f26806c = str;
    }
}
