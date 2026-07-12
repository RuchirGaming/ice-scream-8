package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM_TIME_PROVIDER = new TimeProvider() { // from class: io.grpc.internal.TimeProvider.1
        @Override // io.grpc.internal.TimeProvider
        public long currentTimeNanos() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    };

    long currentTimeNanos();
}
