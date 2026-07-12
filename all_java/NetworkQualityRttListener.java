package org.chromium.net;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public abstract void onRttObservation(int i2, long j2, int i3);

    public NetworkQualityRttListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }
}
