package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class df1<T extends TextView> implements ea<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArgbEvaluator f30078a = new ArgbEvaluator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f30079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30080c;

    private static class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f30081a;

        a(TextView textView) {
            this.f30081a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f30081a.setTextColor(((Integer) animatedValue).intValue());
            }
        }
    }

    public df1(int i2) {
        this.f30080c = i2;
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f30078a, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f30080c));
        this.f30079b = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(new a(textView));
        this.f30079b.setDuration(500);
        this.f30079b.start();
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final void cancel() {
        ValueAnimator valueAnimator = this.f30079b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f30079b.cancel();
        }
    }
}
