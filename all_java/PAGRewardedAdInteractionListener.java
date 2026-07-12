package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.PAGAdListener;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface PAGRewardedAdInteractionListener extends PAGAdListener {
    void onUserEarnedReward(PAGRewardItem pAGRewardItem);

    void onUserEarnedRewardFail(int i2, String str);
}
