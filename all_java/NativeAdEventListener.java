package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
