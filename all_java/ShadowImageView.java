package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ShadowImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f3552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f3553b;

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3553b.right == getMeasuredWidth() && this.f3553b.bottom == getMeasuredHeight()) {
            return;
        }
        this.f3553b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f3553b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f3553b.bottom / 2.0f, this.f3552a);
        super.onDraw(canvas);
    }
}
