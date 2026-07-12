package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GradientDrawable f29238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ColorDrawable f29239b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f29238a = gradientDrawable;
        f29239b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
