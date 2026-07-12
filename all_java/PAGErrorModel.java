package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGErrorModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4861b;

    public PAGErrorModel(int i2, String str) {
        this.f4860a = i2;
        this.f4861b = str;
    }

    public int getErrorCode() {
        return this.f4860a;
    }

    public String getErrorMessage() {
        return this.f4861b;
    }
}
