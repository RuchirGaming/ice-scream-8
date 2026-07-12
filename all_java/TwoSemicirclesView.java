package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class TwoSemicirclesView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f7609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f7612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f7613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f7614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f7615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7617i;

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7614f = -90.0f;
        this.f7615g = 220.0f;
        this.f7616h = Color.parseColor("#FFFFFF");
        this.f7617i = Color.parseColor("#C4C4C4");
        a();
        float f2 = this.f7615g;
        this.f7609a = new RectF(-f2, -f2, f2, f2);
    }

    private void a() {
        Paint paint = new Paint();
        this.f7612d = paint;
        paint.setColor(this.f7616h);
        this.f7612d.setStyle(Paint.Style.STROKE);
        this.f7612d.setStrokeWidth(4.0f);
        this.f7612d.setAlpha(20);
        Paint paint2 = new Paint(this.f7612d);
        this.f7613e = paint2;
        paint2.setColor(this.f7617i);
        this.f7613e.setAlpha(255);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f7610b = i2;
        this.f7611c = i3;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f7609a;
        float f2 = this.f7615g;
        rectF.set(-f2, -f2, f2, f2);
        canvas.translate(this.f7610b / 2, this.f7611c / 2);
        canvas.drawArc(this.f7609a, this.f7614f, 180.0f, false, this.f7612d);
        canvas.drawArc(this.f7609a, this.f7614f + 180.0f, 180.0f, false, this.f7613e);
    }

    public void setCurrentStartAngle(float f2) {
        this.f7614f = f2;
        postInvalidate();
    }

    public void setRadius(float f2) {
        this.f7615g = f2;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f7612d = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.f7612d;
    }

    public void setPaintTwo(Paint paint) {
        this.f7613e = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.f7613e;
    }
}
