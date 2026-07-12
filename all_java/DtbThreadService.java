package com.amazon.device.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class DtbThreadService {
    private static long SCHEDULE_INTERVAL = 10;
    private static DtbThreadService threadServiceInstance = new DtbThreadService();
    private ScheduledExecutorService scheduler;
    private boolean shutdownInProgress = false;
    private final ExecutorService executor = Executors.newFixedThreadPool(1);

    private DtbThreadService() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the fixed thread pool");
                DtbThreadService.this.executor.shutdown();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the thread pool");
                if (DtbThreadService.this.scheduler != null) {
                    DtbThreadService.this.scheduler.shutdown();
                }
            }
        });
    }

    static DtbThreadService getInstance() {
        return threadServiceInstance;
    }

    void execute(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            this.executor.execute(runnable);
        } catch (InternalError e2) {
            handleError(e2);
        }
    }

    void schedule(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            if (this.scheduler == null) {
                this.scheduler = Executors.newScheduledThreadPool(1);
            }
            this.scheduler.schedule(runnable, SCHEDULE_INTERVAL, TimeUnit.SECONDS);
        } catch (InternalError e2) {
            handleError(e2);
        }
    }

    private void handleError(InternalError internalError) {
        internalError.getLocalizedMessage().contains("shutdown");
        throw internalError;
    }

    static void executeOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
