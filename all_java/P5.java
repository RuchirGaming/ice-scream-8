package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class P5 {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i2, int[] iArr) {
        this.A00.put(i2, iArr);
    }

    public final boolean A01(int i2) {
        return this.A00.indexOfKey(i2) >= 0;
    }

    public final int[] A02(int i2) {
        return this.A00.get(i2);
    }
}
