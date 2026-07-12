package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface OnFyberMarketplaceInitializedListener {

    public enum FyberInitStatus {
        SUCCESSFULLY,
        FAILED_NO_KITS_DETECTED,
        FAILED,
        INVALID_APP_ID
    }

    void onFyberMarketplaceInitialized(FyberInitStatus fyberInitStatus);
}
