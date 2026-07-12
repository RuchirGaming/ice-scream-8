package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
class ThrottledForwardingExecutor implements Executor {
    private final Semaphore availableSlots;
    private final Executor executor;

    ThrottledForwardingExecutor(int i2, Executor executor) {
        this.availableSlots = new Semaphore(i2);
        this.executor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (this.availableSlots.tryAcquire()) {
            try {
                this.executor.execute(new Runnable() { // from class: com.google.firebase.firestore.util.ThrottledForwardingExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m550xc0e914ff(runnable);
                    }
                });
                return;
            } catch (RejectedExecutionException unused) {
                runnable.run();
                return;
            }
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: lambda$execute$0$com-google-firebase-firestore-util-ThrottledForwardingExecutor, reason: not valid java name */
    public /* synthetic */ void m550xc0e914ff(Runnable runnable) {
        runnable.run();
        this.availableSlots.release();
    }
}
