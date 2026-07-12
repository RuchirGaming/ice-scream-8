package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface InterstitialAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();
}
