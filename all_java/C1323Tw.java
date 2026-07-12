package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1323Tw implements LB {
    public int A00;
    public final LB A01;

    public C1323Tw(LB lb, int i2) {
        this.A01 = lb;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void ADy(String str) {
        if (this.A00 > 0) {
            this.A01.ADy(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void flush() {
        this.A01.flush();
    }
}
