package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.b;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface PAGLoadListener<Ad> extends b {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.b
    void onError(int i2, String str);
}
