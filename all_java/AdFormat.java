package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    UNKNOWN(5),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int i2) {
        this.zzb = i2;
    }

    public int getValue() {
        return this.zzb;
    }
}
