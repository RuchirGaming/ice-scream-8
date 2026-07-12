package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
interface GhostView {
    void reserveEndViewTransition(ViewGroup viewGroup, View view);

    void setVisibility(int i2);
}
