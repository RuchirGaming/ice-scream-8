package com.google.android.gms.ads.rewarded;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    String getType();
}
