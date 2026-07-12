package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class dd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f30071a = new Object();

    @Pure
    public static void a(String str, String str2) {
        synchronized (f30071a) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void b(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (f30071a) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (f30071a) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f30071a) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void a(String str, Exception exc) {
        c("BundleUtil", a(str, (Throwable) exc));
    }

    @Pure
    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    @Pure
    private static String a(String str, Throwable th) {
        boolean z;
        String strReplace;
        synchronized (f30071a) {
            try {
                if (th == null) {
                    strReplace = null;
                } else {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            z = true;
                            break;
                        }
                        cause = cause.getCause();
                    }
                    strReplace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }
}
