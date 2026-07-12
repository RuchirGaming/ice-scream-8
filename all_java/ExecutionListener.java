package androidx.work.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ExecutionListener {
    void onExecuted(String workSpecId, boolean needsReschedule);
}
