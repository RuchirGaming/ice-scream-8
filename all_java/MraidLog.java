package com.explorestack.iab.mraid;

import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class MraidLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f8407a = new Logger("MraidLog");

    public static Logger.LogLevel a() {
        return f8407a.a();
    }

    public static void a(String str, String str2, Object... objArr) {
        f8407a.a(str, str2, objArr);
    }

    public static void a(String str, Throwable th) {
        f8407a.a(str, th);
    }

    public static void addLogListener(LogListener logListener) {
        f8407a.a(logListener);
    }

    public static void b(String str, String str2, Object... objArr) {
        f8407a.b(str, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        f8407a.c(str, str2, objArr);
    }

    public static boolean removeLogListener(LogListener logListener) {
        return f8407a.b(logListener);
    }

    public static void setLoggingLevel(Logger.LogLevel logLevel) {
        f8407a.b(logLevel);
    }
}
