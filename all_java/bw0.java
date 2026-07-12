package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yodo1.mas.mediation.yandex.BuildConfig;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class bw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29528a = "Yandex";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29529b = BuildConfig.SDK_VERSION_NAME;

    private bw0() {
    }

    public final String b() {
        return this.f29528a;
    }

    public final String c() {
        return this.f29529b;
    }

    public static bw0 a() {
        if (!TextUtils.isEmpty("Yandex")) {
            if (!TextUtils.isEmpty(BuildConfig.SDK_VERSION_NAME)) {
                return new bw0();
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }
}
