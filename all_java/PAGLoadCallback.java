package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad);

    void onError(PAGErrorModel pAGErrorModel);
}
