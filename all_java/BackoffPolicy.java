package io.grpc.internal;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface BackoffPolicy {

    public interface Provider {
        BackoffPolicy get();
    }

    long nextBackoffNanos();
}
