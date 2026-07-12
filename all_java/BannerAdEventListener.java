package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
