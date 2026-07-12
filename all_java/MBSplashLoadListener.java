package com.mbridge.msdk.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface MBSplashLoadListener {
    void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z);

    void onLoadFailed(MBridgeIds mBridgeIds, String str, int i2);

    void onLoadSuccessed(MBridgeIds mBridgeIds, int i2);
}
