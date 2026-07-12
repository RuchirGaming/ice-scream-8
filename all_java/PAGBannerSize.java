package com.bytedance.sdk.openadsdk.api.banner;

import com.amazon.device.ads.DtbConstants;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public final class PAGBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4811b;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(DtbConstants.DEFAULT_PLAYER_WIDTH, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(LogSeverity.NOTICE_VALUE, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i2, int i3) {
        this.f4810a = i2;
        this.f4811b = i3;
    }

    public int getWidth() {
        return this.f4810a;
    }

    public int getHeight() {
        return this.f4811b;
    }
}
