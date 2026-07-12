package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface AppOpenAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();
}
