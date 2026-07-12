package com.facebook.ads.redexgen.X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1100Lg {
    public static final int A00;
    public static final ExecutorService A01;
    public static volatile boolean A02;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        A00 = iAvailableProcessors;
        A01 = Executors.newFixedThreadPool(iAvailableProcessors);
        A02 = true;
    }
}
