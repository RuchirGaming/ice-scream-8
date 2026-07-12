package com.monetization.ads.mediation.rewarded;

import com.monetization.ads.mediation.base.MediatedAdRequestError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
