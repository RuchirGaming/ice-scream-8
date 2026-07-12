package com.mbridge.msdk.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface MBSplashShowListener {
    void onAdClicked(MBridgeIds mBridgeIds);

    void onAdTick(MBridgeIds mBridgeIds, long j2);

    void onDismiss(MBridgeIds mBridgeIds, int i2);

    void onShowFailed(MBridgeIds mBridgeIds, String str);

    void onShowSuccessed(MBridgeIds mBridgeIds);

    void onZoomOutPlayFinish(MBridgeIds mBridgeIds);

    void onZoomOutPlayStart(MBridgeIds mBridgeIds);
}
