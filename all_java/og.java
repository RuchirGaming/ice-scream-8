package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class og implements mg<BitmapDrawable> {
    og() {
    }

    @Override // com.yandex.mobile.ads.impl.mg
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return bitmap.equals(((BitmapDrawable) drawable).getBitmap());
    }
}
