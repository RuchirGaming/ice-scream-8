package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGRewardItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4877b;

    public PAGRewardItem(int i2, String str) {
        this.f4876a = i2;
        this.f4877b = str;
    }

    public int getRewardAmount() {
        return this.f4876a;
    }

    public String getRewardName() {
        return this.f4877b;
    }
}
