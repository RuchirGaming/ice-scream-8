package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2653a;

    public UGScrollView(Context context) {
        super(context);
    }

    public void a(b bVar) {
        this.f2653a = bVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b bVar = this.f2653a;
        if (bVar != null) {
            int[] iArrA = bVar.a(i2, i3);
            super.onMeasure(iArrA[0], iArrA[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar = this.f2653a;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.f2653a;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2653a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2653a;
        if (bVar != null) {
            bVar.g();
        }
    }
}
