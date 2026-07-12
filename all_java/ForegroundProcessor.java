package androidx.work.impl.foreground;

import androidx.work.ForegroundInfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ForegroundProcessor {
    void startForeground(String workSpecId, ForegroundInfo foregroundInfo);

    void stopForeground(String workSpecId);
}
