package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ShakeAnimationView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f3554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f3555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f3556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f3557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f3558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f3559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3562i;

    public interface a {
    }

    public ShakeAnimationView(Context context, View view, int i2, int i3, int i4) {
        super(context);
        this.f3560g = i2;
        this.f3561h = i3;
        this.f3562i = i4;
        a(context, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void a(Context context, View view) {
        addView(view);
        if (view instanceof com.bytedance.sdk.component.adexpress.layout.a) {
            com.bytedance.sdk.component.adexpress.layout.a aVar = (com.bytedance.sdk.component.adexpress.layout.a) view;
            this.f3559f = aVar.getHandContainer();
            this.f3555b = aVar.getRockImg();
            this.f3554a = aVar.getRockTopText();
            this.f3557d = aVar.getRockText();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f3559f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f3557d.setText(str);
    }

    public LinearLayout getShakeLayout() {
        return this.f3559f;
    }

    public void setOnShakeViewListener(a aVar) {
        this.f3558e = aVar;
    }

    public void a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.f3555b != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new b(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.f3555b.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                ShakeAnimationView.this.f3555b.startAnimation(rotateAnimation);
            }
        }
    }

    private static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            if (f2 <= 0.25f) {
                return (f2 * (-2.0f)) + 0.5f;
            }
            if (f2 <= 0.5f) {
                return (f2 * 4.0f) - 1.0f;
            }
            return f2 <= 0.75f ? (f2 * (-4.0f)) + 3.0f : (f2 * 2.0f) - 1.5f;
        }

        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f3556c == null) {
                this.f3556c = new t(getContext().getApplicationContext());
            }
            this.f3556c.a(new t.a() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
            });
            this.f3556c.a(this.f3560g);
            this.f3556c.c(this.f3561h);
            this.f3556c.a(this.f3562i);
            this.f3556c.a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        t tVar = this.f3556c;
        if (tVar != null) {
            if (z) {
                tVar.a();
            } else {
                tVar.b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.f3556c;
        if (tVar != null) {
            tVar.b();
        }
    }
}
