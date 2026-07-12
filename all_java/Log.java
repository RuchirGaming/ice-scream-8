package com.yandex.div.internal;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Log {
    private static volatile boolean sEnabled = false;

    private Log() {
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void setEnabled(Boolean bool) {
        sEnabled = bool.booleanValue();
    }

    public static void v(String str, String str2) {
        if (isEnabled()) {
            android.util.Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (isEnabled()) {
            android.util.Log.v(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (isEnabled()) {
            android.util.Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (isEnabled()) {
            android.util.Log.d(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (isEnabled()) {
            android.util.Log.w(str, str2);
        }
    }

    public static void w(String str, Throwable th) {
        if (isEnabled()) {
            android.util.Log.w(str, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isEnabled()) {
            android.util.Log.w(str, str2, th);
        }
    }

    public static void i(String str, String str2) {
        if (isEnabled()) {
            android.util.Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (isEnabled()) {
            android.util.Log.i(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (isEnabled()) {
            android.util.Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (isEnabled()) {
            android.util.Log.e(str, str2, th);
        }
    }
}
