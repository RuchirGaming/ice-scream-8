package com.applovin.exoplayer2.l;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class ag {
    private long CD;
    private long acS;
    private long acT;
    private final ThreadLocal<Long> acU = new ThreadLocal<>();

    public ag(long j2) {
        aI(j2);
    }

    public synchronized long pS() {
        long j2;
        j2 = this.CD;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = C.TIME_UNSET;
        }
        return j2;
    }

    public synchronized long pT() {
        long jPS;
        long j2 = this.acT;
        if (j2 != C.TIME_UNSET) {
            jPS = j2 + this.acS;
        } else {
            jPS = pS();
        }
        return jPS;
    }

    public synchronized long pU() {
        return this.acS;
    }

    public synchronized void aI(long j2) {
        this.CD = j2;
        this.acS = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.acT = C.TIME_UNSET;
    }

    public synchronized long br(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j3 = this.acT;
        if (j3 != C.TIME_UNSET) {
            long jBu = bu(j3);
            long j4 = (4294967296L + jBu) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j2;
            j2 += j4 * 8589934592L;
            if (Math.abs(j5 - jBu) < Math.abs(j2 - jBu)) {
                j2 = j5;
            }
        }
        return bs(bt(j2));
    }

    public synchronized long bs(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.acS == C.TIME_UNSET) {
            long jLongValue = this.CD;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) a.checkNotNull(this.acU.get())).longValue();
            }
            this.acS = jLongValue - j2;
            notifyAll();
        }
        this.acT = j2;
        return j2 + this.acS;
    }

    public static long bt(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public static long bu(long j2) {
        return (j2 * 90000) / 1000000;
    }
}
