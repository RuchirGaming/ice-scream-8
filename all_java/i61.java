package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class i61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re1 f31555a = new re1();

    i61() {
    }

    static Point a(i61 i61Var, Display display) {
        Point point;
        i61Var.getClass();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        try {
            point = new Point(((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue(), ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(display, new Object[0])).intValue());
        } catch (Throwable unused) {
            point = null;
        }
        return point == null ? new Point(display.getWidth(), display.getHeight()) : point;
    }

    final Point a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f31555a.getClass();
        Point pointA = null;
        if (windowManager != null) {
            try {
                defaultDisplay = windowManager.getDefaultDisplay();
            } catch (Throwable unused) {
                defaultDisplay = null;
            }
        } else {
            defaultDisplay = null;
        }
        re1 re1Var = this.f31555a;
        Point point = new Point(0, 0);
        re1Var.getClass();
        if (defaultDisplay != null) {
            try {
                pointA = a(this, defaultDisplay);
            } catch (Throwable unused2) {
            }
        }
        return pointA == null ? point : pointA;
    }
}
