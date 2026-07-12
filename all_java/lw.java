package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class lw extends RuntimeException {
    public lw(int i2) {
        super(a(i2));
    }

    private static String a(int i2) {
        if (i2 == 1) {
            return "Player release timed out.";
        }
        if (i2 != 2) {
            return i2 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
