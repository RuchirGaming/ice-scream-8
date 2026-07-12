package com.apm.insight;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
