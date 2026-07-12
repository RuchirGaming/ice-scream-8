package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public abstract class PAGRewardedAdInteractionCallback {
    public void onAdClicked() {
    }

    public void onAdDismissed() {
    }

    public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
    }

    public void onAdShowed() {
    }

    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
    }

    public void onUserEarnedRewardFail(PAGErrorModel pAGErrorModel) {
    }
}
