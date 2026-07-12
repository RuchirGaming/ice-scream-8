package com.mbridge.msdk.foundation.entity;

import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class InteractiveAdsCamPaignTag implements NoProGuard, Serializable {
    private long campaignCreateTime;
    private String id;
    private int isClick;
    private int resourceType;

    public InteractiveAdsCamPaignTag() {
    }

    public InteractiveAdsCamPaignTag(String str, int i2, long j2, int i3) {
        this.id = str;
        this.resourceType = i2;
        this.campaignCreateTime = j2;
        this.isClick = i3;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(int i2) {
        this.resourceType = i2;
    }

    public long getCampaignCreateTime() {
        return this.campaignCreateTime;
    }

    public void setCampaignCreateTime(long j2) {
        this.campaignCreateTime = j2;
    }

    public int getIsClick() {
        return this.isClick;
    }

    public void setIsClick(int i2) {
        this.isClick = i2;
    }
}
