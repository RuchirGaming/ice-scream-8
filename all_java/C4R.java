package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C4R extends Observable<C4S> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C4S) this.mObservers.get(size)).A00();
        }
    }
}
