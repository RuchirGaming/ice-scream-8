package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.b90;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class MobileInstreamAds {
    private MobileInstreamAds() {
    }

    public static void setAdGroupPreloading(boolean z) {
        b90.a().a(z);
    }

    static void setControlsEnabled(boolean z) {
        b90.a().b(z);
    }

    static void setDiscardAdGroupOnSkip(boolean z) {
        b90.a().c(z);
    }
}
