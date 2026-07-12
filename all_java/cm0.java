package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class cm0 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29854b = kw1.a("YandexAds", ".UrlTracker");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29855c = kw1.a("YandexAds", ".BaseController");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29856d = kw1.a("YandexAds", ".AdvertisingId");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29857a;

    public cm0(String str) {
        this.f29857a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f29857a);
    }
}
