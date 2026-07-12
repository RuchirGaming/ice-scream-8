package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class p01 extends ga0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f33661b;

    public static void a(boolean z) {
        f33661b = z;
    }

    public static void a(String str, Object... objArr) {
        if (f33661b) {
            Log.w("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }
}
