package com.yandex.mobile.ads.impl;

import android.location.Location;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class bd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f29314a;

    bd0(Object obj) {
        this.f29314a = obj;
    }

    final Location a() {
        Object objA = w11.a(this.f29314a, "getResult", new Object[0]);
        if (objA instanceof Location) {
            return (Location) objA;
        }
        return null;
    }

    final boolean b() {
        Object objA = w11.a(this.f29314a, "isComplete", new Object[0]);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }
}
