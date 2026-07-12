package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.a11;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class ColorizedRatingView extends a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23678a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(Context context) {
        super(context);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    drawable2.setColorFilter(new BlendModeColorFilter(-3355444, BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i3 = f23678a;
                if (i2 >= 29) {
                    drawable3.setColorFilter(new BlendModeColorFilter(i3, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i2 >= 29) {
                    drawable4.setColorFilter(new BlendModeColorFilter(i3, BlendMode.SRC_ATOP));
                } else {
                    drawable4.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
    }

    public ColorizedRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorizedRatingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
