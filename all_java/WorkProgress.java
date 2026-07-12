package androidx.work.impl.model;

import androidx.work.Data;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class WorkProgress {
    public final Data mProgress;
    public final String mWorkSpecId;

    public WorkProgress(String workSpecId, Data progress) {
        this.mWorkSpecId = workSpecId;
        this.mProgress = progress;
    }
}
