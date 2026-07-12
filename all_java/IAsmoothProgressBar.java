package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f12105c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f12107b;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f12106a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12107b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setProgress(i2);
            return;
        }
        ValueAnimator valueAnimator = this.f12106a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12106a;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
            this.f12106a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f12105c);
            this.f12106a.addUpdateListener(new a());
        } else {
            valueAnimator2.setIntValues(getProgress(), i2);
        }
        this.f12106a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i2) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setSecondaryProgress(i2);
            return;
        }
        ValueAnimator valueAnimator = this.f12107b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f12107b;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
            this.f12107b = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f12105c);
            this.f12107b.addUpdateListener(new b());
        } else {
            valueAnimator2.setIntValues(getProgress(), i2);
        }
        this.f12107b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
