package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f22340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f22342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f22344e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f22342c = animatorSet;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f22340a = dVar;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f22344e = bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f22342c;
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
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f22341b && (dVar = this.f22340a) != null) {
            this.f22341b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f22342c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        b bVar;
        super.onVisibilityChanged(view, i2);
        if (!(view instanceof MBridgeRelativeLayout) || i2 != 0 || (bVar = this.f22344e) == null || this.f22343d) {
            return;
        }
        this.f22343d = true;
        bVar.a();
    }
}
