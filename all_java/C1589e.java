package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.pgl.ssdk.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class C1589e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23844c;

    private static void a(Context context) {
        int height;
        int i2;
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT < 17) {
                if (Build.VERSION.SDK_INT >= 13) {
                    defaultDisplay.getSize(point);
                    i2 = point.x;
                } else {
                    f23842a = defaultDisplay.getWidth();
                    height = defaultDisplay.getHeight();
                }
                f23843b = height;
            }
            defaultDisplay.getRealSize(point);
            i2 = point.x;
            f23842a = i2;
            height = point.y;
            f23843b = height;
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            a(context);
            if (context != null) {
                try {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.density;
                    f23844c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f3 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        return "" + f23844c + "[<!>]" + f23842a + "," + f23843b + "[<!>]";
    }
}
