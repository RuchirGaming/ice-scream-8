package com.yandex.mobile.ads.impl;

import android.app.Dialog;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f32624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dm f32625b;

    public lk(Dialog dialog, dm dmVar) {
        this.f32624a = dialog;
        this.f32625b = dmVar;
    }

    public final void a() {
        this.f32624a.dismiss();
        this.f32625b.e();
    }

    public final void b() {
        this.f32624a.dismiss();
    }
}
