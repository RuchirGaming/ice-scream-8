package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class oc0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f33429d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile oc0 f33430e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f33431a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cm0 f33432b = new cm0(cm0.f29855c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33433c = 0;

    private oc0() {
    }

    public static oc0 a() {
        if (f33430e == null) {
            synchronized (f33429d) {
                if (f33430e == null) {
                    f33430e = new oc0();
                }
            }
        }
        return f33430e;
    }

    public final Executor b() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f33429d) {
            if (this.f33431a.size() < 4) {
                executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f33432b);
                this.f33431a.add(executorNewSingleThreadExecutor);
            } else {
                executorNewSingleThreadExecutor = (Executor) this.f33431a.get(this.f33433c);
                int i2 = this.f33433c + 1;
                this.f33433c = i2;
                if (i2 == 4) {
                    this.f33433c = 0;
                }
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
