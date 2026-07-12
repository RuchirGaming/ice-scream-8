package io.bidmachine.ads.networks.gam;

import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
interface InternalGAMAdPresentListener {
    void onAdClicked();

    void onAdExpired();

    void onAdShowFailed(BMError bMError);

    void onAdShown();
}
