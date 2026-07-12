package com.yodo1.mas;

import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasLog {
    private static final String TAG = "Yodo1Mas";
    private static boolean enableDebugLog = false;

    public static void enableDebugLog(boolean enable) {
        enableDebugLog = enable;
    }

    public static void v(String msg) {
        log(2, TAG, msg, null);
    }

    public static void v(String tag, String msg) {
        log(2, TAG, tag + " " + msg, null);
    }

    public static void d(String msg) {
        log(3, TAG, msg, null);
    }

    public static void d(String tag, String msg) {
        log(3, TAG, tag + " " + msg, null);
    }

    public static void i(String msg) {
        log(4, TAG, msg, null);
    }

    public static void i(String tag, String msg) {
        log(4, TAG, tag + " " + msg, null);
    }

    public static void w(String msg) {
        log(5, TAG, msg, null);
    }

    public static void w(String tag, String msg) {
        log(5, TAG, tag + " " + msg, null);
    }

    public static void e(String msg) {
        log(6, TAG, msg, null);
    }

    public static void e(String tag, String msg) {
        log(6, TAG, tag + " " + msg, null);
    }

    private static void log(int level, String tag, String content, Exception e2) {
        if (level == 2) {
            Log.v(tag, content, e2);
            return;
        }
        if (level == 3) {
            if (enableDebugLog) {
                Log.d(tag, content, e2);
            }
        } else if (level == 4) {
            Log.i(tag, content, e2);
        } else if (level == 5) {
            Log.w(tag, content, e2);
        } else {
            if (level != 6) {
                return;
            }
            Log.e(tag, content, e2);
        }
    }
}
