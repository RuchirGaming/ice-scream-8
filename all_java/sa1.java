package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class sa1 {
    public static int a(Context context, int i2, float f2) {
        return Math.round(TypedValue.applyDimension(i2, f2, context.getResources().getDisplayMetrics()));
    }
}
