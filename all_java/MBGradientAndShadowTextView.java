package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f19307e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f19303a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f19304b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f19305c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f19306d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f19303a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f19304b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f19305c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f19306d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f19303a = gradientAndShadowParameters.gradientStartColor;
            this.f19304b = gradientAndShadowParameters.gradientEndColor;
            this.f19305c = gradientAndShadowParameters.shadowColor;
            this.f19306d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19303a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f19304b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f19305c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f19306d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f19303a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f19304b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f19305c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f19306d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f19303a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f19304b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f19305c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f19306d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    private void a() {
        setTextSize(this.f19306d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f19307e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f19303a, this.f19304b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f19305c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f19307e);
        super.onDraw(canvas);
    }
}
