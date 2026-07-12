package com.applovin.sdk;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AppLovinAd {
    @Deprecated
    long getAdIdNumber();

    @Deprecated
    String getAdValue(String str);

    @Deprecated
    String getAdValue(String str, String str2);

    AppLovinAdSize getSize();

    AppLovinAdType getType();

    String getZoneId();

    @Deprecated
    boolean isVideoAd();
}
