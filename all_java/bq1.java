package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class bq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f29453a;

    public bq1(ArrayList arrayList) {
        this.f29453a = arrayList;
    }

    public final List<String> a() {
        return this.f29453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bq1.class != obj.getClass()) {
            return false;
        }
        return this.f29453a.equals(((bq1) obj).f29453a);
    }

    public final int hashCode() {
        return this.f29453a.hashCode();
    }
}
