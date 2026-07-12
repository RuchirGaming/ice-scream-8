package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class C extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f23898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f23899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f23900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bitmap f23901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Bitmap f23902e;

    enum a {
        /* JADX INFO: Fake field, exist only in values array */
        Center,
        /* JADX INFO: Fake field, exist only in values array */
        Fit,
        Fill
    }

    public C(Context context, a aVar) {
        super(context);
        this.f23900c = ViewCompat.MEASURED_STATE_MASK;
        this.f23898a = aVar;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.f23899b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
        int identifier2 = getResources().getIdentifier("staticSplashScreenBackgroundColor", "color", getContext().getPackageName());
        if (identifier2 != 0) {
            this.f23900c = getResources().getColor(identifier2);
        }
        setBackgroundColor(this.f23900c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f23901d;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23901d = null;
        }
        Bitmap bitmap2 = this.f23902e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f23902e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f23899b == 0) {
            return;
        }
        if (this.f23901d == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.f23901d = BitmapFactory.decodeResource(getResources(), this.f23899b, options);
        }
        int width = this.f23901d.getWidth();
        int height = this.f23901d.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f2 = width / height;
        float f3 = width2;
        float f4 = height2;
        boolean z2 = f3 / f4 <= f2;
        int iOrdinal = this.f23898a.ordinal();
        if (iOrdinal == 0) {
            if (width2 < width) {
                height = (int) (f3 / f2);
                width = width2;
            }
            if (height2 < height) {
                width = (int) (f4 * f2);
                height = height2;
            }
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            if ((this.f23898a == a.Fill) ^ z2) {
                height = (int) (f3 / f2);
                width = width2;
            } else {
                width = (int) (f4 * f2);
                height = height2;
            }
        }
        Bitmap bitmap = this.f23902e;
        if (bitmap != null) {
            if (bitmap.getWidth() == width && this.f23902e.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.f23902e;
            if (bitmap2 != this.f23901d) {
                bitmap2.recycle();
                this.f23902e = null;
            }
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f23901d, width, height, true);
        this.f23902e = bitmapCreateScaledBitmap;
        bitmapCreateScaledBitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
        ColorDrawable colorDrawable = new ColorDrawable(this.f23900c);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f23902e);
        bitmapDrawable.setGravity(17);
        setBackground(new LayerDrawable(new Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
