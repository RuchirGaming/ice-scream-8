package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER(InneractiveMediationNameConsts.OTHER);

    public final String key;

    InneractiveMediationName(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
