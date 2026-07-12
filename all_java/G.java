package com.unity3d.player;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class G implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Thread.UncaughtExceptionHandler f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23911b;

    G() {
    }

    static void a(String str) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof G) {
            G g2 = (G) defaultUncaughtExceptionHandler;
            int i2 = -1;
            int i3 = -1;
            while (true) {
                int iIndexOf = str.indexOf(47, i2 + 1);
                if (iIndexOf == -1) {
                    break;
                }
                i3 = i2;
                i2 = iIndexOf;
            }
            g2.f23911b = i3 < 0 ? "Unknown" : str.substring(i3 + 1);
        }
    }

    synchronized boolean a() {
        boolean z;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            z = false;
        } else {
            this.f23910a = defaultUncaughtExceptionHandler;
            this.f23911b = "Unknown";
            Thread.setDefaultUncaughtExceptionHandler(this);
            z = true;
        }
        return z;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            Error error = new Error(String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + String.format("Unity version     : %s\n", "2022.3.11f1") + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + String.format("Device fingerprint: %s\n", Build.FINGERPRINT) + String.format("CPU supported ABI : %s\n", Arrays.toString(Build.SUPPORTED_ABIS)) + String.format("Build Type        : %s\n", "Release") + String.format("Scripting Backend : %s\n", "IL2CPP") + String.format("Libs loaded from  : %s\n", this.f23911b) + String.format("Strip Engine Code : %s\n", Boolean.TRUE));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f23910a.uncaughtException(thread, error);
        } catch (Throwable unused) {
            this.f23910a.uncaughtException(thread, th);
        }
    }
}
