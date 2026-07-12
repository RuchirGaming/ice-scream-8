package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface sn {
    void a(AdImpressionData adImpressionData);

    void closeNativeAd();

    void onAdClicked();

    void onLeftApplication();

    void onReturnedToApplication();
}
