package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGImageItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4865d;

    public PAGImageItem(int i2, int i3, String str, float f2) {
        this.f4865d = 0.0f;
        this.f4862a = i2;
        this.f4863b = i3;
        this.f4864c = str;
        this.f4865d = f2;
    }

    public PAGImageItem(int i2, int i3, String str) {
        this(i2, i3, str, 0.0f);
    }

    public int getHeight() {
        return this.f4862a;
    }

    public int getWidth() {
        return this.f4863b;
    }

    public String getImageUrl() {
        return this.f4864c;
    }

    public float getDuration() {
        return this.f4865d;
    }
}
