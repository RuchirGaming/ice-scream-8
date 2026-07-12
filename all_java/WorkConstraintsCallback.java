package androidx.work.impl.constraints;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List<String> workSpecIds);

    void onAllConstraintsNotMet(List<String> workSpecIds);
}
