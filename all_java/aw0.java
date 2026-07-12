package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class aw0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29190b;

    protected aw0(String str, Exception exc, boolean z, int i2) {
        super(str, exc);
        this.f29189a = z;
        this.f29190b = i2;
    }

    public static aw0 a(String str, IllegalArgumentException illegalArgumentException) {
        return new aw0(str, illegalArgumentException, true, 0);
    }

    public static aw0 a(String str, Exception exc) {
        return new aw0(str, exc, true, 1);
    }

    public static aw0 a(String str) {
        return new aw0(str, null, false, 1);
    }
}
