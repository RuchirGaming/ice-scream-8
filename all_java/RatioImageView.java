package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RatioImageView extends PAGImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f7560a;

    public RatioImageView(Context context) {
        this(context, null);
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = getLayoutParams().width;
        int i5 = getLayoutParams().height;
        float f2 = this.f7560a;
        if (f2 > 0.0f) {
            if (i4 == -2) {
                size = (int) (size2 * f2);
                mode = 1073741824;
            } else if (i5 == -2) {
                size2 = (int) (size / f2);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f2) {
        this.f7560a = f2;
    }
}
