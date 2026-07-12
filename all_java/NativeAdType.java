package com.yandex.mobile.ads.nativeads;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum NativeAdType {
    CONTENT("content"),
    APP_INSTALL(MBridgeConstans.DYNAMIC_VIEW_WX_APP),
    MEDIA(com.ironsource.sdk.constants.a.h.I0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37531a;

    NativeAdType(String str) {
        this.f37531a = str;
    }

    public String getValue() {
        return this.f37531a;
    }
}
