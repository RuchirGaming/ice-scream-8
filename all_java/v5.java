package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ColorDrawable f36003a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final LayerDrawable f36004b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        int i2 = u5.f35699b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f36004b = layerDrawable;
    }
}
