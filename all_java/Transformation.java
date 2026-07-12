package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface Transformation {
    String key();

    Bitmap transform(Bitmap bitmap);
}
