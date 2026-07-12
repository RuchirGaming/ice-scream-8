package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class y80 implements yl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final in f36881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36884d;

    public y80(in inVar, String str, int i2, int i3) {
        this.f36881a = inVar;
        this.f36882b = str;
        this.f36883c = i2;
        this.f36884d = i3;
    }

    public final in a() {
        return this.f36881a;
    }

    public final int getAdHeight() {
        return this.f36884d;
    }

    public final int getAdWidth() {
        return this.f36883c;
    }

    @Override // com.yandex.mobile.ads.impl.yl1
    public final String getUrl() {
        return this.f36882b;
    }
}
