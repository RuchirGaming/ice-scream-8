package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RippleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ValueAnimator f3542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueAnimator f3543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f3544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f3545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f3546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f3547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator.AnimatorListener f3548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3549j;

    public RippleView(Context context, int i2) {
        super(context);
        this.f3545f = 300L;
        this.f3546g = 0.0f;
        this.f3549j = i2;
        a();
    }

    public void a() {
        Paint paint = new Paint(1);
        this.f3544e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3544e.setColor(this.f3549j);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f3540a = i2 / 2.0f;
        this.f3541b = i3 / 2.0f;
        this.f3547h = (float) (Math.hypot(i2, i3) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f3540a, this.f3541b, this.f3546g, this.f3544e);
    }

    public void b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f3547h);
        this.f3542c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f3545f);
        this.f3542c.setInterpolator(new LinearInterpolator());
        this.f3542c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.f3546g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f3542c.start();
    }

    public void c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f3547h, 0.0f);
        this.f3543d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f3545f);
        this.f3543d.setInterpolator(new LinearInterpolator());
        this.f3543d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.f3546g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f3548i;
        if (animatorListener != null) {
            this.f3543d.addListener(animatorListener);
        }
        this.f3543d.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f3548i = animatorListener;
    }
}
