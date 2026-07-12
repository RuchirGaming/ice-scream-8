package com.mbridge.msdk.out;

import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class RewardInfo implements NoProGuard, Serializable {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z, int i2) {
        this.isCompleteView = z;
        this.rewardAlertStatus = i2;
    }

    public RewardInfo(boolean z, String str, String str2) {
        this.isCompleteView = z;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z, String str, String str2, int i2) {
        this.isCompleteView = z;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i2;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z) {
        this.isCompleteView = z;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public void setRewardAlertStatus(int i2) {
        this.rewardAlertStatus = i2;
    }

    public String toString() {
        return "RewardInfo{isCompleteView=" + this.isCompleteView + ", rewardName='" + this.rewardName + "', rewardAmount='" + this.rewardAmount + "', rewardAlertStatus=" + this.rewardAlertStatus + AbstractJsonLexerKt.END_OBJ;
    }
}
