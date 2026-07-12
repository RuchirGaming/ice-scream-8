package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class TTRoundRectImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f3620d;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3618b = 25;
        this.f3619c = 25;
        Paint paint = new Paint();
        this.f3617a = paint;
        paint.setAntiAlias(true);
        this.f3617a.setFilterBitmap(true);
        this.f3620d = new Matrix();
    }

    public void setXRound(int i2) {
        this.f3618b = i2;
        postInvalidate();
    }

    public void setYRound(int i2) {
        this.f3619c = i2;
        postInvalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap bitmapA = a(drawable);
            if (bitmapA != null) {
                BitmapShader bitmapShader = new BitmapShader(bitmapA, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                float fMax = (bitmapA.getWidth() == getWidth() && bitmapA.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
                this.f3620d.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.f3620d);
                this.f3617a.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f3618b, this.f3619c, this.f3617a);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    private Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
