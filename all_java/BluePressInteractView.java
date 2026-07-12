package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.utils.s;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class BluePressInteractView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimatorSet f3406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ObjectAnimator f3407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f3409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f3410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f3411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f3412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f3415j;

    public BluePressInteractView(Context context, int i2, int i3) {
        super(context);
        this.f3408c = false;
        this.f3406a = new AnimatorSet();
        this.f3413h = i2;
        this.f3414i = i3;
        this.f3415j = context;
        c();
        d();
    }

    private void c() {
        View view = new View(this.f3415j);
        this.f3409d = view;
        view.setBackground(a("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.f3413h) * 0.45d), (int) (((double) this.f3414i) * 0.45d));
        layoutParams.gravity = 17;
        this.f3409d.setLayoutParams(layoutParams);
        addView(this.f3409d);
        View view2 = new View(this.f3415j);
        this.f3410e = view2;
        view2.setBackground(a("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.f3413h) * 0.25d), (int) (((double) this.f3414i) * 0.25d));
        layoutParams2.gravity = 17;
        this.f3410e.setLayoutParams(layoutParams2);
        addView(this.f3410e);
        View view3 = new View(this.f3415j);
        this.f3411f = view3;
        view3.setBackground(a("#807BBEFF", "#FF7BBEFF"));
        int i2 = this.f3413h;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i2) * 0.25d), (int) (((double) i2) * 0.25d));
        layoutParams3.gravity = 17;
        this.f3411f.setLayoutParams(layoutParams3);
        addView(this.f3411f);
        ImageView imageView = new ImageView(this.f3415j);
        this.f3412g = imageView;
        imageView.setImageResource(s.d(getContext(), "tt_blue_hand"));
        this.f3412g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.f3413h) * 0.62d), (int) (((double) this.f3414i) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.f3412g.setLayoutParams(layoutParams4);
        addView(this.f3412g);
    }

    private void d() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3409d, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f3409d, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f3410e, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f3410e, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f3411f, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f3411f, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f3412g, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.f3407b = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.f3406a.setDuration(1500L);
        this.f3406a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f3406a.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.f3406a.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.BluePressInteractView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (BluePressInteractView.this.f3408c) {
                    return;
                }
                BluePressInteractView.this.f3407b.start();
                BluePressInteractView.this.f3406a.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                BluePressInteractView.this.f3408c = true;
            }
        });
    }

    private GradientDrawable a(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void a() {
        this.f3408c = false;
        ObjectAnimator objectAnimator = this.f3407b;
        if (objectAnimator == null || this.f3406a == null) {
            return;
        }
        objectAnimator.start();
        this.f3406a.start();
    }

    public void b() {
        this.f3408c = true;
        ObjectAnimator objectAnimator = this.f3407b;
        if (objectAnimator == null || this.f3406a == null) {
            return;
        }
        objectAnimator.cancel();
        this.f3406a.cancel();
    }
}
