package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class CornerIV extends PAGImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7526b;

    public CornerIV(Context context) {
        super(context);
        this.f7525a = 0;
        this.f7526b = 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapA;
        if (a()) {
            return;
        }
        measure(0, 0);
        if (b()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        try {
            bitmapA = a(bitmapCopy, radius);
        } catch (Throwable unused2) {
            bitmapA = null;
        }
        if (bitmapA == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapA, (this.f7525a / 2) - radius, (this.f7526b / 2) - radius, (Paint) null);
        }
    }

    private boolean a() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    private boolean b() {
        return getDrawable().getClass() == NinePatchDrawable.class || ((getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null);
    }

    private int getRadius() {
        if (this.f7525a == 0) {
            this.f7525a = getWidth();
        }
        if (this.f7526b == 0) {
            this.f7526b = getHeight();
        }
        int i2 = this.f7525a;
        int i3 = this.f7526b;
        if (i2 >= i3) {
            i2 = i3;
        }
        return i2 / 2;
    }

    private Bitmap a(Bitmap bitmap, int i2) {
        Bitmap bitmapCreateBitmap;
        int i3 = i2 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            bitmapCreateBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i3 || bitmap.getHeight() != i3) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i3, i3, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }
}
