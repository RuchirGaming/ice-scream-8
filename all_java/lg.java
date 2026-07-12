package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f32600a = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bitmap f32603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f32604e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final rg f32602c = new rg();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f32601b = new Handler(Looper.getMainLooper());

        a(Bitmap bitmap, b bVar) {
            this.f32603d = bitmap;
            this.f32604e = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            rg rgVar = this.f32602c;
            Bitmap bitmap = this.f32603d;
            rgVar.getClass();
            this.f32601b.post(new kg(this, rg.a(bitmap)));
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public final void a(Bitmap bitmap, b bVar) {
        this.f32600a.execute(new a(bitmap, bVar));
    }
}
