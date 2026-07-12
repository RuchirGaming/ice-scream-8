package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class AtomicLongCounter implements LongCounter {
    private final AtomicLong counter = new AtomicLong();

    AtomicLongCounter() {
    }

    @Override // io.grpc.internal.LongCounter
    public void add(long j2) {
        this.counter.getAndAdd(j2);
    }

    @Override // io.grpc.internal.LongCounter
    public long value() {
        return this.counter.get();
    }
}
