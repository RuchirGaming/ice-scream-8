package com.fyber.marketplace.fairbid.bridge;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface MarketplaceBannerAd extends MarketplaceBridgeAd {
    boolean canRefresh();

    int getAdHeight();

    int getAdWidth();

    boolean isUsingFullWidth();

    void showInView(ViewGroup viewGroup, MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener);
}
