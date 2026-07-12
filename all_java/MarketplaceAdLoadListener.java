package com.fyber.marketplace.fairbid.bridge;

import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface MarketplaceAdLoadListener<T extends MarketplaceBridgeAd> {
    void onAdLoadFailed(MarketplaceAdLoadError marketplaceAdLoadError);

    void onAdLoaded(T t);
}
