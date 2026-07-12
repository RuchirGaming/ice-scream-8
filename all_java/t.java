package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class t {

    @Deprecated
    public static final String dj = "ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    private static final HashSet<String> dk = new HashSet<>();
    private static String dl = "goog.exo.core";

    public static synchronized String bQ() {
        return dl;
    }

    public static synchronized void f(String str) {
        if (dk.add(str)) {
            dl += ", " + str;
        }
    }
}
