package com.applovin.mediation;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    String getMediatedNetworkErrorMessage();

    String getMessage();

    long getRequestLatencyMillis();

    MaxAdWaterfallInfo getWaterfall();
}
