package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public /* synthetic */ class C06381w {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[AdSettings.IntegrationErrorMode.values().length];
        A00 = iArr;
        try {
            iArr[AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            A00[AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
