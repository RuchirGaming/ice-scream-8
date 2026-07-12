package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PangleViewStub extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f5366b;

    public interface a {
        View a(Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public PangleViewStub(Context context, a aVar) {
        super(context);
        this.f5365a = aVar;
        a();
    }

    private void a() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        View view = this.f5366b;
        if (view != null) {
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            b();
        }
    }

    private View b() {
        a aVar;
        if (this.f5366b == null && (aVar = this.f5365a) != null) {
            this.f5366b = aVar.a(getContext());
            a(this.f5366b, (ViewGroup) getParent());
        }
        return this.f5366b;
    }

    private void a(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }
}
