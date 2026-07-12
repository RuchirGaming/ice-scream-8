package com.applovin.exoplayer2;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class u extends RuntimeException {
    public final int dm;

    private static String A(int i2) {
        if (i2 == 1) {
            return "Player release timed out.";
        }
        if (i2 != 2) {
            return i2 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }

    public u(int i2) {
        super(A(i2));
        this.dm = i2;
    }
}
