package com.yodo1.mas.analytics.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasSdkInitInfo {
    public boolean adInitFromCache;
    public String apiVersion;
    public long duration;
    public String result;
    public String sessionId;
    public boolean showAgePop;
    public boolean showUMPPop;

    public Yodo1MasSdkInitInfo(String sessionId) {
        this.sessionId = sessionId;
    }
}
