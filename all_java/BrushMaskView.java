package com.bytedance.sdk.component.adexpress.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.sdk.component.utils.l;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class BrushMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3417a = "BrushMaskView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f3418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f3419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Canvas f3420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f3421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BitmapDrawable f3422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f3423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f3424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f3425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f3426j;

    public BrushMaskView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint();
        this.f3418b = paint;
        paint.setAntiAlias(true);
        this.f3418b.setDither(true);
        setMaskColor(-1426063361);
        Paint paint2 = new Paint();
        this.f3421e = paint2;
        paint2.setAntiAlias(true);
        this.f3421e.setDither(true);
        Paint paint3 = new Paint();
        this.f3426j = paint3;
        paint3.setColor(-7829368);
        this.f3426j.setAlpha(100);
        this.f3426j.setAntiAlias(true);
        this.f3426j.setDither(true);
        this.f3426j.setStyle(Paint.Style.STROKE);
        this.f3426j.setStrokeCap(Paint.Cap.ROUND);
        if (Build.VERSION.SDK_INT >= 21) {
            setWatermark(-1);
        } else {
            setMaskColor(-1426063361);
        }
        Paint paint4 = new Paint();
        this.f3423g = paint4;
        paint4.setAntiAlias(true);
        this.f3423g.setDither(true);
        this.f3423g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f3423g.setStyle(Paint.Style.STROKE);
        this.f3423g.setStrokeCap(Paint.Cap.ROUND);
        setEraserSize(60.0f);
        this.f3424h = new Path();
        this.f3425i = new Path();
    }

    public void setEraserSize(float f2) {
        this.f3423g.setStrokeWidth(f2);
        this.f3426j.setStrokeWidth(f2);
    }

    public void setMaskColor(int i2) {
        this.f3418b.setColor(i2);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(a(i2), a(i3));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f3419c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f3421e);
        }
    }

    public void a(float f2, float f3) {
        b(f2, f3);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a(i2, i3);
    }

    private void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.f3419c = bitmapCreateBitmap;
            Canvas canvas = this.f3420d;
            if (canvas == null) {
                this.f3420d = new Canvas(this.f3419c);
            } else {
                canvas.setBitmap(bitmapCreateBitmap);
            }
            this.f3420d.drawRoundRect(new RectF(0.0f, 0.0f, i2, i3), 120.0f, 120.0f, this.f3418b);
            if (this.f3422f != null) {
                this.f3422f.setBounds(new Rect(0, 0, i2, i3));
                this.f3422f.draw(this.f3420d);
            }
        } catch (Exception e2) {
            l.e(f3417a, e2.getMessage());
        }
    }

    private int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(0, size);
        }
        return 0;
    }

    private void b(float f2, float f3) {
        this.f3424h.reset();
        this.f3425i.reset();
        this.f3424h.moveTo(f2, f3);
        this.f3425i.moveTo(f2, f3);
    }

    public void setWatermark(int i2) {
        if (i2 == -1) {
            this.f3422f = null;
        } else {
            this.f3422f = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), i2));
        }
    }

    public void a() {
        a(getWidth(), getHeight());
        invalidate();
    }

    public void b() {
        c();
    }

    public void c() {
        final int width = getWidth();
        final int height = getHeight();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setIntValues(0, width);
        valueAnimator.setInterpolator(new TimeInterpolator() { // from class: com.bytedance.sdk.component.adexpress.widget.BrushMaskView.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                int i2 = (int) (width * f2);
                if (BrushMaskView.this.f3420d != null) {
                    Canvas canvas = BrushMaskView.this.f3420d;
                    int i3 = height;
                    canvas.drawRect(0.0f, i3 / 2, i2 - 50, i3 / 2, BrushMaskView.this.f3423g);
                    BrushMaskView.this.f3420d.drawCircle(i2, height / 2, 10.0f, BrushMaskView.this.f3423g);
                }
                BrushMaskView.this.postInvalidate();
                return f2;
            }
        });
        valueAnimator.start();
    }
}
