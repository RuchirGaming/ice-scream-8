package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1011Hq implements Comparator<C1012Hr> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C1012Hr c1012Hr, C1012Hr c1012Hr2) {
        if (c1012Hr.A00 < c1012Hr2.A00) {
            return -1;
        }
        return c1012Hr2.A00 < c1012Hr.A00 ? 1 : 0;
    }
}
