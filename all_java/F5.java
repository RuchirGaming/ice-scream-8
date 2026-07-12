package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class F5 {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public F5() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public F5(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
        HI.A03(iArr.length == uriArr.length);
        this.A00 = i2;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.A01;
            int nextAdIndexToPlay = iArr.length;
            if (i4 >= nextAdIndexToPlay || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
