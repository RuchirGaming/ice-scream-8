package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class MaxRewardImpl implements MaxReward {
    private final int alr;
    private final String dp;

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public static MaxReward create(int i2, String str) {
        return new MaxRewardImpl(i2, str);
    }

    private MaxRewardImpl(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.dp = str;
        this.alr = i2;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.dp;
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.alr;
    }

    public String toString() {
        return "MaxReward{amount=" + this.alr + ", label=" + this.dp + "}";
    }
}
