package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGEditText extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2634a;

    public UGEditText(Context context) {
        super(context);
    }

    public void a(b bVar) {
        this.f2634a = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        b bVar = this.f2634a;
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
        b bVar = this.f2634a;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.f2634a;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2634a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2634a;
        if (bVar != null) {
            bVar.g();
        }
    }
}
