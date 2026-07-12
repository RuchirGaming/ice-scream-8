package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ok1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URL f33538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33539c;

    private ok1(String str, URL url, String str2) {
        this.f33537a = str;
        this.f33538b = url;
        this.f33539c = str2;
    }

    public static ok1 a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new ok1(str, url, str2);
    }

    public static ok1 a(URL url) {
        return new ok1(null, url, null);
    }

    public final URL a() {
        return this.f33538b;
    }

    public final String b() {
        return this.f33537a;
    }

    public final String c() {
        return this.f33539c;
    }
}
