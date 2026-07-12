package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kf1 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f32215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32217c;

    public kf1(Drawable drawable, int i2, int i3) {
        this.f32215a = drawable;
        this.f32216b = i2;
        this.f32217c = i3;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f32215a != null && this.f32216b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f32215a;
            int i2 = this.f32216b;
            drawable.setBounds(0, 0, i2, i2);
            m9 m9Var = new m9(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i3 = this.f32217c;
            colorDrawable.setBounds(0, 0, i3, i3);
            m9 m9Var2 = new m9(colorDrawable);
            spannableStringBuilder.setSpan(m9Var, 0, 1, 33);
            spannableStringBuilder.setSpan(m9Var2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
