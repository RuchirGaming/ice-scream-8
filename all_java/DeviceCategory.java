package com.iab.omid.library.ironsrc.adsession;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    OTHER(InneractiveMediationNameConsts.OTHER);

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }
}
