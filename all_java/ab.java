package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class ab {
    public static boolean M(int i2, int i3) {
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            return i2 == 2 && (i3 & 2) != 0;
        }
        return (i3 & 1) != 0;
    }

    public static int L(int i2, int i3) {
        for (int i4 = 1; i4 <= 2; i4++) {
            int i5 = (i2 + i4) % 3;
            if (M(i5, i3)) {
                return i5;
            }
        }
        return i2;
    }
}
