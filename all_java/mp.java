package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32920a;

    public mp(Context context) {
        this.f32920a = context.getApplicationContext();
    }

    public final boolean a() {
        return (this.f32920a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
