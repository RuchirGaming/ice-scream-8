package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mv0 implements gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32969a;

    public mv0(int i2) {
        this.f32969a = i2;
    }

    @Override // com.yandex.mobile.ads.impl.gs
    public final boolean a(Context context) {
        return this.f32969a == context.getResources().getConfiguration().orientation;
    }
}
