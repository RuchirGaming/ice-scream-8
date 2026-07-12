package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private final b VJ;
    private a VK;
    private float VL;
    private int VM;

    public interface a {
        void a(float f2, float f3, boolean z);
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.VM = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.VM = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.VJ = new b();
    }

    public void setAspectRatio(float f2) {
        if (this.VL != f2) {
            this.VL = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
        this.VK = aVar;
    }

    public int getResizeMode() {
        return this.VM;
    }

    public void setResizeMode(int i2) {
        if (this.VM != i2) {
            this.VM = i2;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.VL <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = f4 / f5;
        float f7 = (this.VL / f6) - 1.0f;
        if (Math.abs(f7) <= 0.01f) {
            this.VJ.b(this.VL, f6, false);
            return;
        }
        int i4 = this.VM;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f2 = this.VL;
                } else if (i4 == 4) {
                    if (f7 > 0.0f) {
                        f2 = this.VL;
                    } else {
                        f3 = this.VL;
                    }
                }
                measuredWidth = (int) (f5 * f2);
            } else {
                f3 = this.VL;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f7 > 0.0f) {
            f3 = this.VL;
            measuredHeight = (int) (f4 / f3);
        } else {
            f2 = this.VL;
            measuredWidth = (int) (f5 * f2);
        }
        this.VJ.b(this.VL, f6, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    private final class b implements Runnable {
        private float VN;
        private float VO;
        private boolean VP;
        private boolean VQ;

        private b() {
        }

        public void b(float f2, float f3, boolean z) {
            this.VN = f2;
            this.VO = f3;
            this.VP = z;
            if (this.VQ) {
                return;
            }
            this.VQ = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.VQ = false;
            if (AspectRatioFrameLayout.this.VK == null) {
                return;
            }
            AspectRatioFrameLayout.this.VK.a(this.VN, this.VO, this.VP);
        }
    }
}
