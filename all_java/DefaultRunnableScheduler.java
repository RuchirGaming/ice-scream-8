package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {
    private final Handler mHandler;

    public DefaultRunnableScheduler() {
        this.mHandler = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    public DefaultRunnableScheduler(Handler handler) {
        this.mHandler = handler;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long delayInMillis, Runnable runnable) {
        this.mHandler.postDelayed(runnable, delayInMillis);
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
