package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.a.k;
import com.bytedance.adsdk.ugeno.b;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, k> f2590b;

    public UGFrameLayout(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, k> map) {
        this.f2590b = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b bVar = this.f2589a;
        if (bVar != null) {
            int[] iArrA = bVar.a(i2, i3);
            super.onMeasure(iArrA[0], iArrA[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        b bVar2 = this.f2589a;
        if (bVar2 != null) {
            bVar2.d();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar = this.f2589a;
        if (bVar != null) {
            bVar.e();
        }
        super.onLayout(z, i2, i3, i4, i5);
        b bVar2 = this.f2589a;
        if (bVar2 != null) {
            bVar2.a(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.f2589a;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, k> map = this.f2590b;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void a(b bVar) {
        this.f2589a = bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2589a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2589a;
        if (bVar != null) {
            bVar.g();
        }
    }
}
