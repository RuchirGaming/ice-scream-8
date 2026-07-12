package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nm f25358a;

    public Mm() {
        this(new Nm());
    }

    public long a(long j2, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j2);
        this.f25358a.getClass();
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    public long b(long j2, TimeUnit timeUnit) {
        if (j2 == 0) {
            return 0L;
        }
        return this.f25358a.b() - timeUnit.toSeconds(j2);
    }

    public long c(long j2, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f25358a.getClass();
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j2));
    }

    public Mm(Nm nm) {
        this.f25358a = nm;
    }
}
