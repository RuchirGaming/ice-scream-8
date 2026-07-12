package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class d61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg f29985a = new pg();

    public final Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            pg pgVar = this.f29985a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            pgVar.getClass();
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            pg pgVar2 = this.f29985a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            pgVar2.getClass();
            bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
