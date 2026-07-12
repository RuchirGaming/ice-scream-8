package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.banner.MediatedBannerSize;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface MediatedBidderTokenLoadListener {
    void onBidderTokenFailedToLoad(String str);

    void onBidderTokenLoaded(String str, MediatedBannerSize mediatedBannerSize);
}
