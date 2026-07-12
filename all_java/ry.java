package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<v60> f34833a;

    public ry(ArrayList arrayList) {
        this.f34833a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ry.class != obj.getClass()) {
            return false;
        }
        return this.f34833a.equals(((ry) obj).f34833a);
    }

    public final int hashCode() {
        return this.f34833a.hashCode();
    }
}
