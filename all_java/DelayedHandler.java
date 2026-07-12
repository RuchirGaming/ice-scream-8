package com.unity.purchasing.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class DelayedHandler implements IDelayedExecutor {
    private Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.unity.purchasing.common.IDelayedExecutor
    public void ExecuteDelayed(Runnable runnable, long j2) {
        this.handler.postDelayed(runnable, j2);
    }
}
