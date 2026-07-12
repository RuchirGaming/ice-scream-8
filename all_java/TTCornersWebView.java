package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class TTCornersWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f7570e;

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f7566a = getMeasuredWidth();
        this.f7567b = getMeasuredHeight();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f7568c = getScrollX();
        this.f7569d = getScrollY();
        Path path = new Path();
        int i2 = this.f7569d;
        path.addRoundRect(new RectF(0.0f, i2, this.f7568c + this.f7566a, i2 + this.f7567b), this.f7570e, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
