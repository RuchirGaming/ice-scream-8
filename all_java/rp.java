package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class rp extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34779b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34780a;

    public rp(int i2) {
        this.f34780a = i2;
    }

    public rp(Throwable th, int i2) {
        super(th);
        this.f34780a = i2;
    }

    public rp(int i2, String str) {
        super(str);
        this.f34780a = i2;
    }

    public rp(int i2, String str, Throwable th) {
        super(str, th);
        this.f34780a = i2;
    }
}
