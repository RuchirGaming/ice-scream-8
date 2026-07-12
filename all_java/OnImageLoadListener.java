package com.mbridge.msdk.out;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface OnImageLoadListener {
    void loadError(String str);

    void loadSuccess(Drawable drawable, int i2);
}
