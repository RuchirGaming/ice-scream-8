package com.facebook.ads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface Ad {

    public interface LoadAdConfig {
    }

    public interface LoadConfigBuilder {
        LoadAdConfig build();

        LoadConfigBuilder withBid(String str);
    }

    void destroy();

    String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
