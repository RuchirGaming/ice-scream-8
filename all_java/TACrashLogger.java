package cn.thinkinganalyticsclone.android.crash;

import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TACrashLogger {
    static boolean isLog = false;

    static void setLog(boolean log) {
        isLog = log;
    }

    public static void verbose(String tag, String msg) {
        if (isLog) {
            Log.v(tag, msg);
        }
    }

    public static void verbose(String tag, String msg, Throwable tr) {
        if (isLog) {
            Log.v(tag, msg, tr);
        }
    }

    public static void info(String tag, String msg) {
        if (isLog) {
            Log.i(tag, msg);
        }
    }

    public static void info(String tag, String msg, Throwable tr) {
        if (isLog) {
            Log.i(tag, msg, tr);
        }
    }

    public static void debug(String tag, String msg) {
        if (isLog) {
            Log.d(tag, msg);
        }
    }

    public static void debug(String tag, String msg, Throwable tr) {
        if (isLog) {
            Log.d(tag, msg, tr);
        }
    }

    public static void error(String tag, String msg) {
        if (isLog) {
            Log.e(tag, msg);
        }
    }

    public static void error(String tag, String msg, Throwable tr) {
        if (isLog) {
            Log.e(tag, msg, tr);
        }
    }

    public static void warn(String tag, String msg) {
        if (isLog) {
            Log.w(tag, msg);
        }
    }

    public static void warn(String tag, String msg, Throwable tr) {
        if (isLog) {
            Log.w(tag, msg, tr);
        }
    }
}
