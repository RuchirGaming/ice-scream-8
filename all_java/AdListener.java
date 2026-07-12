package com.facebook.ads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface AdListener {
    void onAdClicked(Ad ad);

    void onAdLoaded(Ad ad);

    void onError(Ad ad, AdError adError);

    void onLoggingImpression(Ad ad);
}
