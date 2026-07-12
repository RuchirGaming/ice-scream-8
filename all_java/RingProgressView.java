package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RingProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f3533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f3534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f3536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3538g;

    public RingProgressView(Context context) {
        super(context);
        this.f3537f = 1500;
        this.f3532a = context;
        Paint paint = new Paint();
        this.f3533b = paint;
        paint.setAntiAlias(true);
        this.f3533b.setStyle(Paint.Style.STROKE);
        this.f3533b.setStrokeWidth(10.0f);
        this.f3533b.setColor(Color.parseColor("#80FFFFFF"));
        this.f3534c = new RectF();
    }

    public void a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f3536e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f3537f);
        this.f3536e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.f3535d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f3536e.start();
    }

    public void b() {
        ValueAnimator valueAnimator = this.f3536e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void c() {
        this.f3538g = true;
        invalidate();
    }

    public void setDuration(int i2) {
        this.f3537f = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3538g) {
            return;
        }
        canvas.drawArc(this.f3534c, 270.0f, this.f3535d, false, this.f3533b);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f3534c.set(5.0f, 5.0f, i2 - 5, i3 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
