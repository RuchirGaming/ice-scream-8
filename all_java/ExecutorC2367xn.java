package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class ExecutorC2367xn implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f28535a;

    ExecutorC2367xn(C2392yn c2392yn, Handler handler) {
        this.f28535a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f28535a.post(runnable);
    }
}
