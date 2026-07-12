package com.yandex.mobile.ads.impl;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ew1 implements zv1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<zv1> f30567b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zv1 f30568c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f30566a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        this.f30568c = null;
        b();
    }

    public final void a(zv1 zv1Var) {
        zv1Var.a(this);
        this.f30567b.add(zv1Var);
        if (this.f30568c == null) {
            b();
        }
    }

    private void b() {
        zv1 zv1VarPoll = this.f30567b.poll();
        this.f30568c = zv1VarPoll;
        if (zv1VarPoll != null) {
            zv1VarPoll.executeOnExecutor(this.f30566a, new Object[0]);
        }
    }
}
