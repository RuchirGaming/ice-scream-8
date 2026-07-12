package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class rn0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f34769c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile rn0 f34770d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f34771a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34772b;

    private rn0() {
    }

    public static rn0 a() {
        if (f34770d == null) {
            synchronized (f34769c) {
                if (f34770d == null) {
                    f34770d = new rn0();
                }
            }
        }
        return f34770d;
    }

    public final void b(View view, MotionEvent motionEvent) {
        if ((view instanceof TextView) || (view instanceof x01)) {
            a(view, motionEvent);
        }
    }

    private void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f34772b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                this.f34772b = true;
            }
            this.f34771a.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.rn0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(view);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.f34772b) {
            view.setAlpha(view.getAlpha() * 2.0f);
            this.f34772b = false;
        }
    }
}
