package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f33559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f33560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f33561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f33562d;

    public oo(View view, float f2) {
        this(view, f2, f2, f2, f2);
    }

    private static float[] a(float f2, float f3, float f4, float f5) {
        if (f2 > 0.0f || f3 > 0.0f || f4 > 0.0f || f5 > 0.0f) {
            return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        }
        return null;
    }

    public final void a(Canvas canvas) {
        if (this.f33562d == null || this.f33561c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f33561c);
    }

    public oo(View view, float f2, float f3, float f4, float f5) {
        this.f33559a = view;
        this.f33560b = new RectF();
        this.f33561c = new Path();
        this.f33562d = a(f2, f3, f4, f5);
    }

    public final void a() {
        if (this.f33562d != null) {
            int measuredWidth = this.f33559a.getMeasuredWidth();
            int measuredHeight = this.f33559a.getMeasuredHeight();
            int paddingLeft = this.f33559a.getPaddingLeft();
            int paddingTop = this.f33559a.getPaddingTop();
            int paddingRight = measuredWidth - this.f33559a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f33559a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f33560b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f33561c.reset();
            this.f33561c.addRoundRect(this.f33560b, this.f33562d, Path.Direction.CW);
        }
    }
}
