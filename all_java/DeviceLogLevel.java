package com.unity3d.services.core.log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class DeviceLogLevel {
    private static final String LOG_TAG = "UnityAds";
    private String _receivingMethodName;

    public String getLogTag() {
        return LOG_TAG;
    }

    public DeviceLogLevel(String str) {
        this._receivingMethodName = null;
        this._receivingMethodName = str;
    }

    public String getReceivingMethodName() {
        return this._receivingMethodName;
    }
}
