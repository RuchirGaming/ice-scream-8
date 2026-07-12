package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class ik0 implements ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f31634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f31635b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ui1 f31636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31637d;

    private static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f31638b;

        a(View view) {
            this.f31638b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f31638b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    ik0(FrameLayout frameLayout, ui1 ui1Var) {
        this.f31634a = frameLayout;
        frameLayout.setVisibility(8);
        this.f31636c = ui1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void a(boolean z) {
        this.f31637d = true;
        this.f31635b.removeCallbacksAndMessages(null);
        ui1 ui1Var = this.f31636c;
        View view = this.f31634a;
        ui1Var.getClass();
        view.setVisibility(z ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void d() {
        if (this.f31637d) {
            return;
        }
        this.f31635b.postDelayed(new a(this.f31634a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final View e() {
        return this.f31634a;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void invalidate() {
    }
}
