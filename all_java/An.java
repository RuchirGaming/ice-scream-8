package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class An extends ExecutorC2138on {
    @Override // com.yandex.metrica.impl.ob.ExecutorC2138on, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
