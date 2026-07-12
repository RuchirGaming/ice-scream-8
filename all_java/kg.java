package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class kg implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f32218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ lg.a f32219c;

    kg(lg.a aVar, Bitmap bitmap) {
        this.f32219c = aVar;
        this.f32218b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32219c.f32604e.a(this.f32218b);
    }
}
