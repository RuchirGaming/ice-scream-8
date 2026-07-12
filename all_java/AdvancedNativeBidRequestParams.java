package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21113b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i2, int i3) {
        super(str, str2);
        this.f21112a = i3;
        this.f21113b = i2;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i2, int i3) {
        super(str, str2, str3);
        this.f21112a = i3;
        this.f21113b = i2;
    }

    public int getHeight() {
        return this.f21112a;
    }

    public void setHeight(int i2) {
        this.f21112a = i2;
    }

    public int getWidth() {
        return this.f21113b;
    }

    public void setWidth(int i2) {
        this.f21113b = i2;
    }
}
