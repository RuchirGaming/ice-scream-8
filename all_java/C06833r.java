package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C06833r {
    public static final C06823q A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new ZF();
        } else {
            A00 = new C06823q();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f2, float f3) {
        A00.A00(edgeEffect, f2, f3);
    }
}
