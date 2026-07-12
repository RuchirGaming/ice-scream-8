package com.bytedance.sdk.openadsdk.core.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGProgressBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f6433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f6434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f6435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ValueAnimator f6437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6438h;

    public void setProgress(int i2) {
        this.f6432b = i2;
        Drawable drawable = this.f6433c;
        if (drawable != null) {
            drawable.setLevel((int) ((i2 * 10000.0f) / this.f6431a));
        }
    }

    public void setMax(int i2) {
        this.f6431a = i2;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.f6434d = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.f6434d;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                Drawable drawable3 = ((LayerDrawable) this.f6434d).getDrawable(i2);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f6433c = drawable3;
                }
            }
        }
        Drawable drawable4 = this.f6434d;
        if (drawable4 instanceof RotateDrawable) {
            this.f6433c = drawable4;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f6435e = drawable;
        setProgressDrawable(drawable);
        if (this.f6436f && this.f6437g == null) {
            a();
        }
    }

    public PAGProgressBar(Context context) {
        super(context);
        this.f6431a = 100;
    }

    public PAGProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6431a = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a.a(layoutParams);
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setPaddingRelative(i2, i3, i4, i5);
        } else {
            super.setPadding(i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6436f = true;
        if (this.f6435e != null) {
            a();
        }
    }

    private void a() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.f6437g = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.f6437g.setRepeatCount(-1);
        this.f6437g.setInterpolator(new LinearInterpolator());
        this.f6437g.setRepeatMode(1);
        this.f6437g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PAGProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f6437g.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6436f = false;
        ValueAnimator valueAnimator = this.f6437g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6437g.removeAllUpdateListeners();
            this.f6437g = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            if (this.f6438h) {
                this.f6438h = false;
                if (Build.VERSION.SDK_INT >= 19 && (valueAnimator = this.f6437g) != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    a();
                    return;
                }
            }
            return;
        }
        if (this.f6437g == null || this.f6438h) {
            return;
        }
        this.f6438h = true;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f6437g.pause();
            return;
        }
        this.f6437g.cancel();
        this.f6437g.removeAllUpdateListeners();
        this.f6437g = null;
    }
}
