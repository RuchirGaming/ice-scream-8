package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class lw1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f32717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f32718c;

    lw1(WebView webView, String str) {
        this.f32717b = webView;
        this.f32718c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32717b.loadUrl(this.f32718c);
    }
}
