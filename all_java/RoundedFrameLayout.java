package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f39640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f39643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f39646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f39647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f39649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f39650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f39651l;

    public RoundedFrameLayout(Context context) {
        this(context, null);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39645f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_radius, 0.0f);
            this.f39640a = dimension;
            this.f39641b = dimension;
            this.f39642c = dimension;
            this.f39643d = dimension;
            this.f39648i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f39649j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_shadowRadius, -1.0f);
            a();
        } catch (Exception unused) {
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void a() {
        if (this.f39649j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f39650k = paint;
            paint.setShadowLayer(this.f39649j, 0.0f, 0.0f, this.f39648i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f2 = this.f39640a;
        float f3 = this.f39641b;
        float f4 = this.f39643d;
        float f5 = this.f39642c;
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        RectF rectF = this.f39651l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f39640a = f2;
        this.f39641b = f3;
        this.f39642c = f4;
        this.f39643d = f5;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f39650k != null) {
            float f2 = this.f39649j;
            RectF rectF = new RectF(f2, f2, getWidth() - this.f39649j, getHeight() - this.f39649j);
            this.f39651l = rectF;
            float f3 = this.f39640a;
            canvas.drawRoundRect(rectF, f3, f3, this.f39650k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f39646g;
        float f4 = this.f39644e;
        RectF rectF2 = this.f39647h;
        if (paint != null && rectF2 != null && f4 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f39645f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f4);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f5 = this.f39640a;
                canvas.drawRoundRect(rectF2, f5, f5, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f39642c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f39643d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f39640a;
    }

    public float getCornerRadiusTopRight() {
        return this.f39641b;
    }

    public void setCornerRadius(float f2) {
        a(f2, f2, f2, f2);
    }

    public void setShadowColor(int i2) {
        this.f39648i = i2;
        invalidate();
    }

    public void setShadowRadius(float f2) {
        boolean z = this.f39650k == null;
        this.f39649j = f2;
        if (z) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(int i2) {
        this.f39645f = i2;
        if (this.f39646g == null) {
            this.f39646g = new Paint();
        }
        if (this.f39647h == null) {
            this.f39647h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f2) {
        this.f39644e = f2;
        if (this.f39646g == null) {
            this.f39646g = new Paint();
        }
        if (this.f39647h == null) {
            this.f39647h = new RectF();
        }
        invalidate();
    }
}
