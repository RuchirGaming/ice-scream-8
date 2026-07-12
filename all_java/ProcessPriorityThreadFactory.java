package io.bidmachine.core;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class ProcessPriorityThreadFactory implements ThreadFactory {
    private final int threadPriority;

    ProcessPriorityThreadFactory(int i2) {
        this.threadPriority = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.threadPriority);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.bidmachine.core.ProcessPriorityThreadFactory.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread2, Throwable th) {
                Logger.log(th);
            }
        });
        return thread;
    }
}
