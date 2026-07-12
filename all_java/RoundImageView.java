package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f2593b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f2595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f2596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f2597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorFilter f2599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f2601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView.ScaleType f2607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Shader.TileMode f2608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Shader.TileMode f2609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.b f2610s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Shader.TileMode f2592a = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ImageView.ScaleType[] f2594c = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public RoundImageView(Context context) {
        super(context);
        this.f2595d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f2597f = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f2598g = 0.0f;
        this.f2599h = null;
        this.f2600i = false;
        this.f2602k = false;
        this.f2603l = false;
        this.f2604m = false;
        Shader.TileMode tileMode = f2592a;
        this.f2608q = tileMode;
        this.f2609r = tileMode;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f2607p;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f2593b && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f2607p != scaleType) {
            this.f2607p = scaleType;
            switch (AnonymousClass1.f2611a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            c();
            a(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.component.image.RoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2611a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f2611a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2611a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2611a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2611a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2611a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2611a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2611a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f2605n = 0;
        this.f2601j = a.a(drawable);
        c();
        super.setImageDrawable(this.f2601j);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f2605n = 0;
        this.f2601j = a.a(bitmap);
        c();
        super.setImageDrawable(this.f2601j);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.f2605n != i2) {
            this.f2605n = i2;
            this.f2601j = a();
            c();
            super.setImageDrawable(this.f2601j);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable a() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.f2605n;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f2605n, e2);
                this.f2605n = 0;
            }
        }
        return a.a(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        if (this.f2606o != i2) {
            this.f2606o = i2;
            Drawable drawableB = b();
            this.f2596e = drawableB;
            setBackgroundDrawable(drawableB);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        this.f2596e = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable b() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.f2606o;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f2606o, e2);
                this.f2606o = 0;
            }
        }
        return a.a(drawable);
    }

    private void c() {
        a(this.f2601j, this.f2607p);
    }

    private void a(boolean z) {
        if (this.f2604m) {
            if (z) {
                this.f2596e = a.a(this.f2596e);
            }
            a(this.f2596e, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f2599h != colorFilter) {
            this.f2599h = colorFilter;
            this.f2602k = true;
            this.f2600i = true;
            d();
            invalidate();
        }
    }

    private void d() {
        Drawable drawable = this.f2601j;
        if (drawable == null || !this.f2600i) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2601j = drawableMutate;
        if (this.f2602k) {
            drawableMutate.setColorFilter(this.f2599h);
        }
    }

    private void a(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof a) {
            a aVar = (a) drawable;
            aVar.a(scaleType).a(this.f2598g).a(this.f2597f).a(this.f2603l).a(this.f2608q).b(this.f2609r);
            float[] fArr = this.f2595d;
            if (fArr != null) {
                aVar.a(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            d();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                a(layerDrawable.getDrawable(i2), scaleType);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f2596e = drawable;
        a(true);
        super.setBackgroundDrawable(this.f2596e);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f2 : this.f2595d) {
            fMax = Math.max(f2, fMax);
        }
        return fMax;
    }

    public void setCornerRadiusDimen(int i2) {
        float dimension = getResources().getDimension(i2);
        a(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f2) {
        a(f2, f2, f2, f2);
    }

    public void a(float f2, float f3, float f4, float f5) {
        float[] fArr = this.f2595d;
        if (fArr[0] == f2 && fArr[1] == f3 && fArr[2] == f5 && fArr[3] == f4) {
            return;
        }
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[3] = f4;
        fArr[2] = f5;
        c();
        a(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.f2598g;
    }

    public void setBorderWidth(int i2) {
        setBorderWidth(getResources().getDimension(i2));
    }

    public void setBorderWidth(float f2) {
        if (this.f2598g == f2) {
            return;
        }
        this.f2598g = f2;
        c();
        a(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.f2597f.getDefaultColor();
    }

    public void setBorderColor(int i2) {
        setBorderColor(ColorStateList.valueOf(i2));
    }

    public ColorStateList getBorderColors() {
        return this.f2597f;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f2597f.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f2597f = colorStateList;
        c();
        a(false);
        if (this.f2598g > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.f2603l = z;
        c();
        a(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.f2608q;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f2608q == tileMode) {
            return;
        }
        this.f2608q = tileMode;
        c();
        a(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.f2609r;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f2609r == tileMode) {
            return;
        }
        this.f2609r = tileMode;
        c();
        a(false);
        invalidate();
    }

    public void a(com.bytedance.adsdk.ugeno.b bVar) {
        this.f2610s = bVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2610s;
        if (bVar != null) {
            int[] iArrA = bVar.a(i2, i3);
            super.onMeasure(iArrA[0], iArrA[1]);
        } else {
            super.onMeasure(i2, i3);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2610s;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.b bVar = this.f2610s;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.b bVar = this.f2610s;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.b bVar = this.f2610s;
        if (bVar != null) {
            bVar.g();
        }
    }
}
