package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f19160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Camera f19161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Matrix f19162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f19172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19175p;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public MBRotationView(Context context) {
        super(context);
        this.f19165f = 40;
        this.f19166g = 20;
        this.f19167h = 0;
        this.f19168i = 0;
        this.f19170k = 0;
        this.f19171l = 0.5f;
        this.f19172m = 0.9f;
        this.f19173n = true;
        this.f19174o = false;
        this.f19175p = false;
        this.f19160a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19165f = 40;
        this.f19166g = 20;
        this.f19167h = 0;
        this.f19168i = 0;
        this.f19170k = 0;
        this.f19171l = 0.5f;
        this.f19172m = 0.9f;
        this.f19173n = true;
        this.f19174o = false;
        this.f19175p = false;
        this.f19160a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f19165f = 40;
        this.f19166g = 20;
        this.f19167h = 0;
        this.f19168i = 0;
        this.f19170k = 0;
        this.f19171l = 0.5f;
        this.f19172m = 0.9f;
        this.f19173n = true;
        this.f19174o = false;
        this.f19175p = false;
        this.f19160a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f19161b = new Camera();
        this.f19162c = new Matrix();
        setWillNotDraw(false);
    }

    public void setWidthRatio(float f2) {
        this.f19171l = f2;
    }

    public void setHeightRatio(float f2) {
        this.f19172m = f2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        float f2 = i6;
        float f3 = this.f19171l;
        int i7 = (int) (((1.0f - f3) * f2) / 2.0f);
        int i8 = i5 - i3;
        float f4 = i8;
        float f5 = this.f19172m;
        int i9 = (int) (((1.0f - f5) * f4) / 2.0f);
        this.f19163d = (int) (f4 * f5);
        this.f19164e = (int) (f2 * f3);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.layout(i7, i9, i6 - i7, i8 - i9);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = this.f19164e;
            if (i11 != i12) {
                layoutParams.width = i12;
                layoutParams.height = this.f19163d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRotateV(boolean z) {
        this.f19174o = z;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f19174o) {
            int height = getHeight() / 2;
            int i2 = ((this.f19167h * this.f19163d) / 2) / this.f19165f;
            a(canvas, i2, height, 0);
            a(canvas, i2, height, 1);
            if (Math.abs(this.f19167h) > this.f19165f / 2) {
                a(canvas, i2, height, 3);
                a(canvas, i2, height, 2);
                return;
            } else {
                a(canvas, i2, height, 2);
                a(canvas, i2, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i3 = ((this.f19167h * this.f19164e) / 2) / this.f19165f;
        b(canvas, i3, width, 0);
        b(canvas, i3, width, 1);
        if (Math.abs(this.f19167h) > this.f19165f / 2) {
            b(canvas, i3, width, 3);
            b(canvas, i3, width, 2);
        } else {
            b(canvas, i3, width, 2);
            b(canvas, i3, width, 3);
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f19160a, 1000 / this.f19166g);
        }
        this.f19173n = z;
    }

    private void a(int i2, int i3, int i4) {
        float f2 = (-i2) / 2.0f;
        if (i4 == 0) {
            this.f19161b.translate(0.0f, f2, 0.0f);
            float f3 = -i3;
            this.f19161b.rotateX(f3);
            this.f19161b.translate(0.0f, f2, 0.0f);
            this.f19161b.translate(0.0f, f2, 0.0f);
            this.f19161b.rotateX(f3);
            this.f19161b.translate(0.0f, f2, 0.0f);
            return;
        }
        if (i4 == 1) {
            this.f19161b.translate(0.0f, f2, 0.0f);
            this.f19161b.rotateX(i3);
            this.f19161b.translate(0.0f, f2, 0.0f);
        } else if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.f19161b.rotateX(0.0f);
        } else {
            this.f19161b.translate(0.0f, f2, 0.0f);
            this.f19161b.rotateX(-i3);
            this.f19161b.translate(0.0f, f2, 0.0f);
        }
    }

    private void a(Canvas canvas, int i2, int i3, int i4) {
        canvas.save();
        this.f19161b.save();
        this.f19162c.reset();
        float f2 = i2;
        this.f19161b.translate(0.0f, f2, 0.0f);
        this.f19161b.rotateX(this.f19167h);
        this.f19161b.translate(0.0f, f2, 0.0f);
        if (i2 == 0) {
            if (this.f19175p) {
                a(this.f19163d, this.f19165f, i4);
            } else {
                a(-this.f19163d, -this.f19165f, i4);
            }
        } else if (i2 > 0) {
            a(this.f19163d, this.f19165f, i4);
        } else if (i2 < 0) {
            a(-this.f19163d, -this.f19165f, i4);
        }
        this.f19161b.getMatrix(this.f19162c);
        this.f19161b.restore();
        this.f19162c.preTranslate((-getWidth()) / 2, -i3);
        this.f19162c.postTranslate(getWidth() / 2, i3);
        canvas.concat(this.f19162c);
        View childAt = getChildAt(a(i4));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private int a(int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.f19175p) {
                        i4 = this.f19168i;
                        i3 = i4 - 1;
                    } else {
                        i5 = this.f19168i;
                        i3 = i5 + 1;
                    }
                } else {
                    i3 = i2 != 3 ? 0 : this.f19168i;
                }
            } else if (this.f19175p) {
                i5 = this.f19168i;
                i3 = i5 + 1;
            } else {
                i4 = this.f19168i;
                i3 = i4 - 1;
            }
        } else if (this.f19175p) {
            i3 = this.f19168i - 2;
        } else {
            i3 = this.f19168i + 2;
        }
        int childCount = i3 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    private void b(int i2, int i3, int i4) {
        if (i4 == 0) {
            float f2 = (-i2) / 2;
            this.f19161b.translate(f2, 0.0f, 0.0f);
            float f3 = -i3;
            this.f19161b.rotateY(f3);
            this.f19161b.translate(f2, 0.0f, 0.0f);
            this.f19161b.translate(f2, 0.0f, 0.0f);
            this.f19161b.rotateY(f3);
            this.f19161b.translate(f2, 0.0f, 0.0f);
            return;
        }
        if (i4 == 1) {
            float f4 = i2 / 2;
            this.f19161b.translate(f4, 0.0f, 0.0f);
            this.f19161b.rotateY(i3);
            this.f19161b.translate(f4, 0.0f, 0.0f);
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.f19161b.rotateY(0.0f);
        } else {
            float f5 = (-i2) / 2;
            this.f19161b.translate(f5, 0.0f, 0.0f);
            this.f19161b.rotateY(-i3);
            this.f19161b.translate(f5, 0.0f, 0.0f);
        }
    }

    private void b(Canvas canvas, int i2, int i3, int i4) {
        canvas.save();
        this.f19161b.save();
        this.f19162c.reset();
        float f2 = i2;
        this.f19161b.translate(f2, 0.0f, 0.0f);
        this.f19161b.rotateY(this.f19167h);
        this.f19161b.translate(f2, 0.0f, 0.0f);
        if (i2 == 0) {
            if (this.f19175p) {
                b(this.f19164e, this.f19165f, i4);
            } else {
                b(-this.f19164e, -this.f19165f, i4);
            }
        } else if (i2 > 0) {
            b(this.f19164e, this.f19165f, i4);
        } else if (i2 < 0) {
            b(-this.f19164e, -this.f19165f, i4);
        }
        this.f19161b.getMatrix(this.f19162c);
        this.f19161b.restore();
        this.f19162c.preTranslate(-i3, (-getHeight()) / 2);
        this.f19162c.postTranslate(i3, getHeight() / 2);
        canvas.concat(this.f19162c);
        View childAt = getChildAt(a(i4));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    static /* synthetic */ void a(MBRotationView mBRotationView) {
        int iA;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i2 = mBRotationView.f19167h - 1;
        mBRotationView.f19167h = i2;
        int i3 = mBRotationView.f19168i;
        mBRotationView.f19169j = i3;
        int i4 = mBRotationView.f19165f;
        int i5 = i3 - (i2 / i4);
        int i6 = i2 % i4;
        mBRotationView.f19167h = i6;
        mBRotationView.f19168i = i5;
        if (Math.abs(i6) > mBRotationView.f19165f / 2) {
            iA = mBRotationView.a(2);
        } else {
            iA = mBRotationView.a(3);
        }
        if (mBRotationView.f19170k != iA) {
            mBRotationView.f19170k = iA;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f19173n) {
            mBRotationView.postDelayed(mBRotationView.f19160a, 1000 / mBRotationView.f19166g);
        }
    }
}
