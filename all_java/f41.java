package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum f41 {
    f30630b("content"),
    f30631c(MBridgeConstans.DYNAMIC_VIEW_WX_APP),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("image"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41(NotificationCompat.CATEGORY_PROMO);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30633a;

    f41(String str) {
        this.f30633a = str;
    }

    public final String a() {
        return this.f30633a;
    }
}
