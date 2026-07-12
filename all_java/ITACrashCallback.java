package cn.thinkinganalyticsclone.android.crash;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ITACrashCallback {
    void onCrash(CrashType crashType, String logPath, String emergency);
}
