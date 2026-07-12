package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.a.b.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class SplashDiffuseView extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3601c = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f3602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3603b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f3604d;

    public SplashDiffuseView(Context context) {
        this(context, null);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3603b = 10;
        b();
    }

    private void b() {
        Paint paint = new Paint();
        this.f3602a = paint;
        paint.setAntiAlias(true);
        this.f3602a.setColor(Color.parseColor("#FFFFFFFF"));
        this.f3602a.setStyle(Paint.Style.STROKE);
        this.f3602a.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f3604d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f3602a.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f3603b, this.f3602a);
    }

    public void a() {
        int iMin = (int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        f3601c = iMin;
        int i2 = iMin - 18;
        f3601c = i2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, i2);
        valueAnimatorOfInt.setInterpolator(b.a(0.2f, 0.0f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SplashDiffuseView.this.f3603b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.f3604d.start();
            }
        });
        valueAnimatorOfInt.start();
    }
}
