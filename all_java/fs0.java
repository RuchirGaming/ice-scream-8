package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class fs0 implements yl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30861c;

    public fs0(int i2, int i3, String str) {
        this.f30859a = str;
        this.f30860b = i2;
        this.f30861c = i3;
    }

    public final int getAdHeight() {
        return this.f30861c;
    }

    public final int getAdWidth() {
        return this.f30860b;
    }

    @Override // com.yandex.mobile.ads.impl.yl1
    public final String getUrl() {
        return this.f30859a;
    }
}
