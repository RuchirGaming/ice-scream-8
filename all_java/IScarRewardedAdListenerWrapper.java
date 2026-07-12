package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IScarRewardedAdListenerWrapper extends IScarAdListenerWrapper {
    void onAdFailedToShow(int i2, String str);

    void onAdImpression();

    void onAdSkipped();

    void onUserEarnedReward();
}
