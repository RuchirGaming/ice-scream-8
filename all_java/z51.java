package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class z51 {
    public static boolean a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable unused) {
            return false;
        }
    }
}
