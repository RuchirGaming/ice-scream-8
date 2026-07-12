package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ag1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f29061d = new ThreadLocal<>();

    public ag1(long j2) {
        c(j2);
    }

    public final synchronized long a() {
        long j2;
        j2 = this.f29058a;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = C.TIME_UNSET;
        }
        return j2;
    }

    public final synchronized long b() {
        long j2;
        j2 = this.f29060c;
        return j2 != C.TIME_UNSET ? j2 + this.f29059b : a();
    }

    public final synchronized long c() {
        return this.f29059b;
    }

    public final synchronized long a(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.f29059b == C.TIME_UNSET) {
            long jLongValue = this.f29058a;
            if (jLongValue == 9223372036854775806L) {
                Long l2 = this.f29061d.get();
                l2.getClass();
                jLongValue = l2.longValue();
            }
            this.f29059b = jLongValue - j2;
            notifyAll();
        }
        this.f29060c = j2;
        return j2 + this.f29059b;
    }

    public final synchronized void c(long j2) {
        this.f29058a = j2;
        this.f29059b = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f29060c = C.TIME_UNSET;
    }

    public final synchronized long b(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j3 = this.f29060c;
        if (j3 != C.TIME_UNSET) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = (4294967296L + j4) / 8589934592L;
            long j6 = ((j5 - 1) * 8589934592L) + j2;
            j2 += j5 * 8589934592L;
            if (Math.abs(j6 - j4) < Math.abs(j2 - j4)) {
                j2 = j6;
            }
        }
        return a((j2 * 1000000) / 90000);
    }
}
