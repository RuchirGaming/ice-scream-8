package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ButtonFlash extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f6170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinearGradient f6171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f6172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f6173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ValueAnimator f6174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6175h;

    public ButtonFlash(Context context) {
        super(context);
        this.f6175h = true;
        b();
    }

    private void b() {
        this.f6172e = new RectF();
        this.f6170c = new Paint();
        c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f6168a = i2;
        this.f6169b = i3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f6168a / 2.0f, this.f6169b, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f6171d = linearGradient;
        this.f6170c.setShader(linearGradient);
        this.f6170c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f6173f = matrix;
        matrix.setTranslate(-this.f6168a, this.f6169b);
        this.f6171d.setLocalMatrix(this.f6173f);
        this.f6172e.set(0.0f, 0.0f, this.f6168a, this.f6169b);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6173f != null) {
            canvas.drawRoundRect(this.f6172e, 100.0f, 100.0f, this.f6170c);
        }
    }

    private void c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6174g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(3000L);
        this.f6174g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.view.ButtonFlash.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((ButtonFlash.this.f6168a * 2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ButtonFlash.this.f6168a;
                if (ButtonFlash.this.f6173f != null) {
                    ButtonFlash.this.f6173f.setTranslate(fFloatValue, ButtonFlash.this.f6169b);
                }
                if (ButtonFlash.this.f6171d != null) {
                    ButtonFlash.this.f6171d.setLocalMatrix(ButtonFlash.this.f6173f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f6175h) {
            this.f6174g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f6174g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.f6175h = z;
    }

    public void a() {
        ValueAnimator valueAnimator = this.f6174g;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f6174g.cancel();
            invalidate();
        }
    }
}
