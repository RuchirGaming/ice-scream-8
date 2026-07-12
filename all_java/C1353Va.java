package com.facebook.ads.redexgen.X;

import android.text.Layout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1353Va extends FV implements Comparable<C1353Va> {
    public final int A00;

    public C1353Va(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4, z, i5);
        this.A00 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1353Va c1353Va) {
        int i2 = c1353Va.A00;
        int i3 = this.A00;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return 0;
    }
}
