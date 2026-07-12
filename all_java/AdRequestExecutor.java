package io.bidmachine;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
class AdRequestExecutor extends ThreadPoolExecutor {
    private static volatile AdRequestExecutor instance;

    public static AdRequestExecutor get() {
        if (instance == null) {
            synchronized (AdRequestExecutor.class) {
                if (instance == null) {
                    instance = new AdRequestExecutor(Runtime.getRuntime().availableProcessors() * 2);
                }
            }
        }
        return instance;
    }

    AdRequestExecutor(int i2) {
        super(i2, i2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }
}
