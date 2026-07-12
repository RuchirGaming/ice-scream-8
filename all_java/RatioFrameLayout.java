package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RatioFrameLayout extends PAGFrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7559a;

    public RatioFrameLayout(Context context) {
        this(context, null);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f7559a = 0.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = getLayoutParams().width;
        int i5 = getLayoutParams().height;
        float f2 = this.f7559a;
        if (f2 > 0.0f) {
            if (i4 == -2) {
                size = (int) (size2 * f2);
                mode = 1073741824;
            } else if (i5 == -2) {
                size2 = (int) (size / f2);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f2) {
        this.f7559a = f2;
    }
}
