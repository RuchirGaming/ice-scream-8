package com.applovin.mediation;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface MaxAdWaterfallInfo {
    long getLatencyMillis();

    MaxAd getLoadedAd();

    String getName();

    List<MaxNetworkResponseInfo> getNetworkResponses();

    String getTestName();
}
