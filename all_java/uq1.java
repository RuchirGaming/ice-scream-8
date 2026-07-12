package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class uq1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gt0 f35919a;

    public uq1() {
        this.f35919a = null;
    }

    public uq1(gt0 gt0Var) {
        this.f35919a = gt0Var;
    }

    public uq1(String str) {
        super(str);
        this.f35919a = null;
    }

    public uq1(Exception exc) {
        super("Failed to parse response", exc);
        this.f35919a = null;
    }

    public uq1(Throwable th) {
        super(th);
        this.f35919a = null;
    }
}
