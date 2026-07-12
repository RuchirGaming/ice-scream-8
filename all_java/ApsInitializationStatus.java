package com.amazon.aps.ads.model;

import com.amazon.aps.shared.util.ApsResult;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class ApsInitializationStatus {
    ApsResult result;

    public ApsInitializationStatus(ApsResult apsResult) {
        this.result = apsResult;
    }

    public ApsResult getResult() {
        return this.result;
    }
}
