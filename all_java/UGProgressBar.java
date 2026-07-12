package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGProgressBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f2637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f2638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f2639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2640e;

    public UGProgressBar(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f2637b = new View(context);
        this.f2638c = new View(context);
        addView(this.f2637b);
        addView(this.f2638c);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2637b.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = -1;
        layoutParams.gravity = 3;
        this.f2637b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2638c.getLayoutParams();
        layoutParams2.width = this.f2640e;
        layoutParams2.gravity = 5;
        this.f2638c.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.f2639d = textView;
        textView.setTextColor(-1);
        this.f2639d.setTextSize(16.0f);
        this.f2639d.setGravity(17);
        addView(this.f2639d);
    }

    public void setProgress(float f2) {
        int width = getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2637b.getLayoutParams();
        float f3 = width;
        float f4 = (f2 / 100.0f) * f3;
        layoutParams.width = (int) f4;
        this.f2637b.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2638c.getLayoutParams();
        layoutParams2.width = (int) (f3 - f4);
        this.f2638c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f2639d.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.gravity = 17;
        requestLayout();
    }

    public void setText(String str) {
        this.f2639d.setText(str);
    }

    public void setTextColor(int i2) {
        this.f2639d.setTextColor(i2);
    }

    public void setProgressColor(int i2) {
        this.f2637b.setBackgroundColor(i2);
    }

    public void setProgressBgColor(int i2) {
        this.f2638c.setBackgroundColor(i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f2640e = i2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b bVar = this.f2636a;
        if (bVar != null) {
            bVar.a(i2, i3);
        }
        super.onMeasure(i2, i3);
        this.f2640e = a(0, i2);
    }

    private int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            return size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar = this.f2636a;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.f2636a;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    public void a(b bVar) {
        this.f2636a = bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2636a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2636a;
        if (bVar != null) {
            bVar.g();
        }
    }
}
