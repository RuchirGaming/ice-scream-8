package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class CircleRippleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f3443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Integer> f3444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f3445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f3446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f3447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f3448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3449n;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3436a = -1;
        this.f3437b = SupportMenu.CATEGORY_MASK;
        this.f3438c = 18.0f;
        this.f3439d = 3;
        this.f3440e = 50.0f;
        this.f3441f = 2;
        this.f3442g = false;
        this.f3443h = new ArrayList();
        this.f3444i = new ArrayList();
        this.f3449n = 24;
        c();
    }

    private void c() {
        Paint paint = new Paint();
        this.f3445j = paint;
        paint.setAntiAlias(true);
        this.f3445j.setStrokeWidth(this.f3449n);
        this.f3443h.add(255);
        this.f3444i.add(0);
        Paint paint2 = new Paint();
        this.f3446k = paint2;
        paint2.setAntiAlias(true);
        this.f3446k.setColor(Color.parseColor("#0FFFFFFF"));
        this.f3446k.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float f2 = i2 / 2.0f;
        this.f3447l = f2;
        this.f3448m = i3 / 2.0f;
        float f3 = f2 - (this.f3449n / 2.0f);
        this.f3440e = f3;
        this.f3438c = f3 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f3445j.setShader(new LinearGradient(this.f3447l, 0.0f, this.f3448m, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3443h.size()) {
                break;
            }
            Integer num = this.f3443h.get(i2);
            this.f3445j.setAlpha(num.intValue());
            Integer num2 = this.f3444i.get(i2);
            if (this.f3438c + num2.intValue() < this.f3440e) {
                canvas.drawCircle(this.f3447l, this.f3448m, this.f3438c + num2.intValue(), this.f3445j);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f3440e) {
                this.f3443h.set(i2, Integer.valueOf(num.intValue() - this.f3441f > 0 ? num.intValue() - (this.f3441f * 3) : 1));
                this.f3444i.set(i2, Integer.valueOf(num2.intValue() + this.f3441f));
            }
            i2++;
        }
        List<Integer> list = this.f3444i;
        if (list.get(list.size() - 1).intValue() >= this.f3440e / this.f3439d) {
            this.f3443h.add(255);
            this.f3444i.add(0);
        }
        if (this.f3444i.size() >= 3) {
            this.f3444i.remove(0);
            this.f3443h.remove(0);
        }
        this.f3445j.setAlpha(255);
        this.f3445j.setColor(this.f3437b);
        canvas.drawCircle(this.f3447l, this.f3448m, this.f3438c, this.f3446k);
        if (this.f3442g) {
            invalidate();
        }
    }

    public void a() {
        this.f3442g = true;
        invalidate();
    }

    public void b() {
        this.f3442g = false;
        this.f3444i.clear();
        this.f3443h.clear();
        this.f3443h.add(255);
        this.f3444i.add(0);
        invalidate();
    }

    public void setColor(int i2) {
        this.f3436a = i2;
    }

    public void setCoreColor(int i2) {
        this.f3437b = i2;
    }

    public void setCoreRadius(int i2) {
        this.f3438c = i2;
    }

    public void setDiffuseWidth(int i2) {
        this.f3439d = i2;
    }

    public void setMaxWidth(int i2) {
        this.f3440e = i2;
    }

    public void setDiffuseSpeed(int i2) {
        this.f3441f = i2;
    }
}
