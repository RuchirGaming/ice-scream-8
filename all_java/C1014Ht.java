package com.facebook.ads.redexgen.X;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1014Ht {
    public long A00;
    public long A01;
    public volatile long A02 = C.TIME_UNSET;

    public C1014Ht(long j2) {
        A02(j2);
    }

    public static long A00(long j2) {
        return (1000000 * j2) / 90000;
    }

    public static long A01(long j2) {
        return (90000 * j2) / 1000000;
    }

    private final synchronized void A02(long j2) {
        HI.A04(this.A02 == C.TIME_UNSET);
        this.A00 = j2;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != C.TIME_UNSET) {
            return this.A01 + this.A02;
        }
        long j2 = this.A00;
        return j2 != Long.MAX_VALUE ? j2 : C.TIME_UNSET;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        return this.A02 == C.TIME_UNSET ? C.TIME_UNSET : this.A01;
    }

    public final long A06(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            this.A02 = j2;
        } else {
            long j3 = this.A00;
            if (j3 != Long.MAX_VALUE) {
                this.A01 = j3 - j2;
            }
            synchronized (this) {
                this.A02 = j2;
                notifyAll();
            }
        }
        return this.A01 + j2;
    }

    public final long A07(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 != C.TIME_UNSET) {
            long jA01 = A01(this.A02);
            long closestWrapCount = (4294967296L + jA01) / 8589934592L;
            long j3 = ((closestWrapCount - 1) * 8589934592L) + j2;
            long j4 = (8589934592L * closestWrapCount) + j2;
            long lastPts = j3 - jA01;
            long jAbs = Math.abs(lastPts);
            long lastPts2 = j4 - jA01;
            if (jAbs >= Math.abs(lastPts2)) {
                j3 = j4;
            }
            j2 = j3;
        }
        long lastPts3 = A00(j2);
        return A06(lastPts3);
    }

    public final void A08() {
        this.A02 = C.TIME_UNSET;
    }
}
