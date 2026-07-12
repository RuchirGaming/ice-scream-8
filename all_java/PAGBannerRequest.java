package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGBannerRequest extends PAGRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PAGBannerSize f4809a;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.f4809a = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.f4809a;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.f4809a = pAGBannerSize;
    }
}
