package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public final synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public final synchronized boolean block(long j2) throws InterruptedException {
        boolean z;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j3 = j2 + jElapsedRealtime;
        while (true) {
            z = this.isOpen;
            if (z || jElapsedRealtime >= j3) {
                break;
            }
            wait(j3 - jElapsedRealtime);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z;
    }
}
