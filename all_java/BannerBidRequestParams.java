package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21115b;

    public BannerBidRequestParams(String str, String str2, int i2, int i3) {
        super(str, str2);
        this.f21114a = i3;
        this.f21115b = i2;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i2, int i3) {
        super(str, str2, str3);
        this.f21114a = i3;
        this.f21115b = i2;
    }

    public int getHeight() {
        return this.f21114a;
    }

    public void setHeight(int i2) {
        this.f21114a = i2;
    }

    public int getWidth() {
        return this.f21115b;
    }

    public void setWidth(int i2) {
        this.f21115b = i2;
    }
}
