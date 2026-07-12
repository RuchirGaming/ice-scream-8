package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class qv1 extends zv1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34427e;

    public qv1(zv1.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(bVar);
        this.f34425c = new HashSet<>(hashSet);
        this.f34426d = jSONObject;
        this.f34427e = j2;
    }
}
