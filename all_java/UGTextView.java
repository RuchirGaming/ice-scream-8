package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.b f2654a;

    public UGTextView(Context context) {
        super(context);
    }

    public void a(com.bytedance.adsdk.ugeno.b bVar) {
        this.f2654a = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2654a;
        if (bVar != null) {
            int[] iArrA = bVar.a(i2, i3);
            super.onMeasure(iArrA[0], iArrA[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2654a;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2654a;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.b bVar = this.f2654a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.b bVar = this.f2654a;
        if (bVar != null) {
            bVar.g();
        }
    }
}
