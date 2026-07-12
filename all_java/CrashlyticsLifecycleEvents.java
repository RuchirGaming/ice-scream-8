package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
interface CrashlyticsLifecycleEvents {
    void onBeginSession(String str, long j2);

    void onCustomKey(String str, String str2);

    void onLog(long j2, String str);

    void onUserId(String str);
}
