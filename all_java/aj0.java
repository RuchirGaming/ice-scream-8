package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.config.VersionInfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class aj0 {
    public static final String a(int i2) {
        return b(i2);
    }

    public static /* synthetic */ String b(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return "PUT";
        }
        if (i2 == 4) {
            return "DELETE";
        }
        if (i2 == 5) {
            return VersionInfo.GIT_BRANCH;
        }
        if (i2 == 6) {
            return "OPTIONS";
        }
        if (i2 == 7) {
            return "TRACE";
        }
        if (i2 == 8) {
            return "PATCH";
        }
        throw null;
    }
}
