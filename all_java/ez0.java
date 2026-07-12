package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ez0 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<ProgressBar> f30594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30596c;

    public ez0(ProgressBar progressBar, int i2, int i3) {
        setInterpolator(new LinearInterpolator());
        this.f30594a = new WeakReference<>(progressBar);
        this.f30595b = i2;
        this.f30596c = i3;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f2, Transformation transformation) {
        ProgressBar progressBar = this.f30594a.get();
        if (progressBar != null) {
            super.applyTransformation(f2, transformation);
            int i2 = this.f30595b;
            progressBar.setProgress(Math.round(((this.f30596c - i2) * f2) + i2));
        }
    }
}
