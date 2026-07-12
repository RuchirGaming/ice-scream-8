package com.amazon.device.ads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface DtbLogListener {
    String getTag();

    void postMessage(DTBLogLevel dTBLogLevel, String str);
}
