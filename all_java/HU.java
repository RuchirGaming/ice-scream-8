package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class HU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public HU(byte[] bArr, int i2) {
        C1001Hg c1001Hg = new C1001Hg(bArr);
        c1001Hg.A07(i2 * 8);
        this.A04 = c1001Hg.A04(16);
        this.A02 = c1001Hg.A04(16);
        this.A05 = c1001Hg.A04(24);
        this.A03 = c1001Hg.A04(24);
        this.A06 = c1001Hg.A04(20);
        this.A01 = c1001Hg.A04(3) + 1;
        this.A00 = c1001Hg.A04(5) + 1;
        this.A07 = ((((long) c1001Hg.A04(4)) & 15) << 32) | (((long) c1001Hg.A04(32)) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / ((long) this.A06);
    }
}
