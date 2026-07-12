package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
@Deprecated
public interface BannerListener {
    @Deprecated
    void onBannerAdClicked();

    @Deprecated
    void onBannerAdLeftApplication();

    @Deprecated
    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onBannerAdLoaded();

    @Deprecated
    void onBannerAdScreenDismissed();

    @Deprecated
    void onBannerAdScreenPresented();
}
