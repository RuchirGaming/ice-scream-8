package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeFramLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimatorSet f19200a;

    public MBridgeFramLayout(Context context) {
        super(context);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f19200a = animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f19200a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f19200a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
