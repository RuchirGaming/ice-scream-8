package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.yandex.div2.PhoneMasks;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ShadowTextView extends PAGTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f7563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f7564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7565c;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f7565c = 0;
        a();
    }

    private void a() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f7563a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7563a.setColor(Color.parseColor("#99333333"));
        this.f7563a.setAntiAlias(true);
        this.f7563a.setStrokeWidth(0.0f);
        this.f7564b = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int iMeasureText = (int) getPaint().measureText(PhoneMasks.EXTRA_NUMBERS);
            this.f7565c = iMeasureText;
            if (measuredWidth < iMeasureText) {
                measuredWidth = iMeasureText;
            }
            int i4 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i4, measuredHeight);
            this.f7564b.set(0.0f, 0.0f, i4, measuredHeight);
            return;
        }
        this.f7564b.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f7564b;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.f7564b.bottom / 2.0f, this.f7563a);
        canvas.translate((this.f7564b.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
