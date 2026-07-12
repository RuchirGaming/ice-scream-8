package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public abstract class PAGAppOpenAdInteractionCallback implements PAGAppOpenAdInteractionListener {
    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }
}
