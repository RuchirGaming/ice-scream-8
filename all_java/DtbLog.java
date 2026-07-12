package com.amazon.device.ads;

import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class DtbLog {
    private static final String DEBUG_ERROR = "DTBERROR::";
    private static boolean androidLogAvailable = false;
    private static boolean isCallerInfoEnabled = false;
    private static final Object listenerLock;
    private static DTBLogLevel logLevel = null;
    private static DtbLogListener logListener = null;
    private static final String sdkName = "Amazon DTB Ads API";

    static {
        try {
            Log.isLoggable("1234", 7);
            androidLogAvailable = true;
        } catch (Throwable unused) {
            androidLogAvailable = false;
        }
        listenerLock = new Object();
        isCallerInfoEnabled = false;
        logLevel = DTBLogLevel.Warn;
    }

    protected static void enableCallerInfo(boolean z) {
        isCallerInfoEnabled = z;
    }

    public static void setLogLevel(DTBLogLevel dTBLogLevel) {
        logLevel = dTBLogLevel;
    }

    private static String getTag() {
        return isCallerInfoEnabled ? getCallerInfo() : sdkName;
    }

    private static void postMessageToListener(String str, DTBLogLevel dTBLogLevel, String str2) {
        if (logListener == null) {
            return;
        }
        synchronized (listenerLock) {
            DtbLogListener dtbLogListener = logListener;
            if (dtbLogListener != null && str.equals(dtbLogListener.getTag())) {
                logListener.postMessage(dTBLogLevel, str2);
            }
        }
    }

    public static void info(String str) {
        if (logLevel.intValue() > DTBLogLevel.Info.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(getTag(), str);
    }

    public static void info(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Info.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(str, str2);
        postMessageToListener(str, DTBLogLevel.Info, str2);
    }

    public static void warn(String str) {
        if (logLevel.intValue() > DTBLogLevel.Warn.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(getTag(), str);
    }

    public static void warn(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Warn.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(str, str2);
        postMessageToListener(str, DTBLogLevel.Warn, str2);
    }

    public static void debug(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), str);
    }

    public static void debug(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, str2);
        postMessageToListener(str, DTBLogLevel.Debug, str2);
    }

    public static void debugError(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), DEBUG_ERROR + str);
    }

    public static void debugError(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, DEBUG_ERROR + str2);
        postMessageToListener(str, DTBLogLevel.Debug, DEBUG_ERROR + str2);
    }

    public static void error(String str) {
        if (logLevel.intValue() > DTBLogLevel.Error.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void error(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Error.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, DTBLogLevel.Error, str2);
    }

    public static void fatal(String str, String str2) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, DTBLogLevel.Fatal, str2);
    }

    public static void fatal(String str) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, Exception exc) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str, exc);
    }

    public static void fatal(String str, String str2, Exception exc) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2, exc);
        postMessageToListener(str, DTBLogLevel.Fatal, str2);
    }

    private static String getCallerInfo() {
        if (!isCallerInfoEnabled) {
            return sdkName;
        }
        StackTraceElement stackTraceElement = null;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            int i2 = 0;
            while (i2 < stackTrace.length) {
                String className = stackTrace[i2].getClassName();
                if (!className.startsWith("dalvik") && !className.startsWith("java")) {
                    int i3 = i2 + 2;
                    if (i3 < stackTrace.length) {
                        i2 = i3;
                    }
                    stackTraceElement = stackTrace[i2];
                    break;
                }
                i2++;
            }
        }
        if (stackTraceElement == null) {
            return sdkName;
        }
        return stackTraceElement.getClassName() + ":" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }
}
