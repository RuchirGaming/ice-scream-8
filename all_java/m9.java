package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class m9 extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Drawable> f32790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32791b;

    public m9(Drawable drawable) {
        super(drawable);
        this.f32791b = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        if (this.f32791b != -1) {
            super.draw(canvas, charSequence, i2, i3, f2, i4, i5, i6, paint);
            return;
        }
        WeakReference<Drawable> weakReference = this.f32790a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f32790a = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(f2, Math.round(((i4 + i6) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference<Drawable> weakReference = this.f32790a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f32790a = new WeakReference<>(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
