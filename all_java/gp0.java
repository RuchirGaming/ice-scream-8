package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31085a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gp0 f31086b;

    private gp0() {
    }

    public static gp0 a() {
        if (f31086b == null) {
            synchronized (f31085a) {
                if (f31086b == null) {
                    f31086b = new gp0();
                }
            }
        }
        return f31086b;
    }
}
