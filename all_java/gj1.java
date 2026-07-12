package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class gj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31053c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f31055b = new Handler(Looper.getMainLooper());

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(gj1.this.f31054a, gj1.f31053c, 1).show();
        }
    }

    gj1(Context context) {
        this.f31054a = context.getApplicationContext();
    }

    final void b() {
        this.f31055b.post(new a());
    }
}
