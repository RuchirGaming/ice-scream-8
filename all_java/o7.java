package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class o7 {
    public static boolean a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    public static boolean a(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
