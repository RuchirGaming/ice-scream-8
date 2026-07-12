package com.yandex.mobile.ads.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class rk0 {
    public static int a(String str) {
        for (int i2 : q6.b(8)) {
            if (a(i2).equals(str)) {
                return i2;
            }
        }
        return 8;
    }

    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "advideocomplete";
        }
        if (i2 == 2) {
            return "impressionTrackingStart";
        }
        if (i2 == 3) {
            return "impressionTrackingSuccess";
        }
        if (i2 == 4) {
            return "close";
        }
        if (i2 == 5) {
            return MRAIDPresenter.OPEN;
        }
        if (i2 == 6) {
            return "rewardedAdComplete";
        }
        if (i2 == 7) {
            return "usecustomclose";
        }
        if (i2 == 8) {
            return "";
        }
        throw null;
    }
}
