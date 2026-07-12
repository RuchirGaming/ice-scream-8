package com.yodo1.mas.banner;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum Yodo1MasBannerAdSize {
    Banner(0),
    LargeBanner(1),
    IABMediumRectangle(2),
    SmartBanner(3),
    AdaptiveBanner(4);

    private final int value;

    Yodo1MasBannerAdSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
