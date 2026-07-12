package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f4806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4807c = null;

    public String getAdString() {
        return this.f4805a;
    }

    public void setAdString(String str) {
        this.f4805a = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f4806b;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f4806b = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f4807c == null) {
            this.f4807c = new Bundle();
        }
        this.f4807c.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f4807c;
    }
}
