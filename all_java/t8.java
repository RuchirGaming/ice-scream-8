package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class t8 implements n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f35432b;

    public t8(String str, Runnable runnable) {
        this.f35431a = str;
        this.f35432b = runnable;
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final boolean a(String str, String str2) {
        return "mobileads".equals(str) && this.f35431a.equals(str2);
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final void a() {
        this.f35432b.run();
    }
}
