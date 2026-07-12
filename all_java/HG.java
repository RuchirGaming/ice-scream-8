package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class HG implements RH {
    @Override // com.facebook.ads.redexgen.X.RH
    public final long A4v() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AFf(Object obj, long j2) throws InterruptedException {
        obj.wait(j2);
    }
}
