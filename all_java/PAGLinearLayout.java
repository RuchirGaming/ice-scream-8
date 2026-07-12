package com.bytedance.sdk.openadsdk.core.customview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGLinearLayout extends LinearLayout {
    public PAGLinearLayout(Context context) {
        super(context);
        a();
    }

    public PAGLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(3);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a.a(layoutParams);
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i2) {
        super.setGravity(a.a(i2));
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setPaddingRelative(i2, i3, i4, i5);
        } else {
            super.setPadding(i2, i3, i4, i5);
        }
    }
}
