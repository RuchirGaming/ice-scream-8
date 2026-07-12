package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class DislikeView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f3462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f3463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f3464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f3466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3467h;

    public DislikeView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f3463d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f3466g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f3464e = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i2) {
        this.f3465f = i2;
    }

    public void setDislikeColor(int i2) {
        this.f3466g.setColor(i2);
    }

    public void setDislikeWidth(int i2) {
        this.f3466g.setStrokeWidth(i2);
    }

    public void setStrokeColor(int i2) {
        this.f3463d.setStyle(Paint.Style.STROKE);
        this.f3463d.setColor(i2);
    }

    public void setStrokeWidth(int i2) {
        this.f3463d.setStrokeWidth(i2);
        this.f3467h = i2;
    }

    public void setBgColor(int i2) {
        this.f3464e.setStyle(Paint.Style.FILL);
        this.f3464e.setColor(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f3462c;
        int i2 = this.f3465f;
        canvas.drawRoundRect(rectF, i2, i2, this.f3464e);
        RectF rectF2 = this.f3462c;
        int i3 = this.f3465f;
        canvas.drawRoundRect(rectF2, i3, i3, this.f3463d);
        int i4 = this.f3460a;
        int i5 = this.f3461b;
        canvas.drawLine(i4 * 0.3f, i5 * 0.3f, i4 * 0.7f, i5 * 0.7f, this.f3466g);
        int i6 = this.f3460a;
        int i7 = this.f3461b;
        canvas.drawLine(i6 * 0.7f, i7 * 0.3f, i6 * 0.3f, i7 * 0.7f, this.f3466g);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f3460a = i2;
        this.f3461b = i3;
        int i6 = this.f3467h;
        this.f3462c = new RectF(i6, i6, this.f3460a - i6, this.f3461b - i6);
    }
}
