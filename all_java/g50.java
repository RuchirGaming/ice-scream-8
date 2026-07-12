package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class g50 {
    static String a(String str, ImageView.ScaleType scaleType) {
        StringBuilder sbA = sf.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }

    static String a(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        StringBuilder sbA = sf.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }
}
