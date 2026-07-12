package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class L6 implements Closeable {
    public L5 A00;
    public boolean A01;
    public final L4 A02;
    public final Runnable A03;

    public L6(long j2, Runnable runnable) {
        L4 l4 = new L4(j2);
        this.A02 = l4;
        l4.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new L5(this);
        }
    }

    public final L4 A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new L5(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        L5 executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
