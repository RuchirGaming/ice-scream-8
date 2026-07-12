package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1821c5<BaseHandler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<BaseHandler> f26651a;

    public C1821c5(List<BaseHandler> list) {
        this.f26651a = Collections.unmodifiableList(list);
    }

    public List<? extends BaseHandler> a() {
        return this.f26651a;
    }
}
