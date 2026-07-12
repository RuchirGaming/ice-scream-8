package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1087Kt {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        AtomicReference<DisplayMetrics> atomicReference = A00;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        return C1088Ku.A03;
    }
}
