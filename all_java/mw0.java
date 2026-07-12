package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32973a;

    public mw0(Context context) {
        this.f32973a = context.getApplicationContext();
    }

    public final boolean a() {
        return a("android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean b() {
        return a("android.permission.ACCESS_FINE_LOCATION");
    }

    private boolean a(String str) {
        try {
            return this.f32973a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
