package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0936Er {
    public C0936Er A00;
    public GT A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0936Er(long j2, int i2) {
        this.A04 = j2;
        this.A03 = ((long) i2) + j2;
    }

    public final int A00(long j2) {
        return ((int) (j2 - this.A04)) + this.A01.A00;
    }

    public final C0936Er A01() {
        this.A01 = null;
        C0936Er c0936Er = this.A00;
        this.A00 = null;
        return c0936Er;
    }

    public final void A02(GT gt, C0936Er c0936Er) {
        this.A01 = gt;
        this.A00 = c0936Er;
        this.A02 = true;
    }
}
