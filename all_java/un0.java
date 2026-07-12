package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class un0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f35842b = Color.parseColor("#eaeaea");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView[] f35843a;

    un0(ImageView... imageViewArr) {
        this.f35843a = imageViewArr;
        b();
    }

    final void a() {
        for (ImageView imageView : this.f35843a) {
            ColorDrawable colorDrawable = (ColorDrawable) imageView.getBackground();
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                objectAnimatorOfPropertyValuesHolder.setTarget(colorDrawable);
                objectAnimatorOfPropertyValuesHolder.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder.start();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                objectAnimatorOfPropertyValuesHolder2.setTarget(drawable);
                objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }
    }

    final void b() {
        for (ImageView imageView : this.f35843a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f35842b);
                }
            }
        }
    }
}
