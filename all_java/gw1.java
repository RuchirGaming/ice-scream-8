package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gw1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gw1 f31150b = new gw1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31151a;

    private gw1() {
    }

    public static gw1 a() {
        return f31150b;
    }

    public final void a(Context context) {
        this.f31151a = context != null ? context.getApplicationContext() : null;
    }

    public final Context b() {
        return this.f31151a;
    }
}
