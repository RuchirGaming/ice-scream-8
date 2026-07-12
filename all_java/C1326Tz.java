package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1326Tz implements LB {
    public int A00;
    public final LB A01;
    public final LB A02;

    public C1326Tz(LB lb, int i2, LB lb2) {
        this.A01 = lb;
        this.A00 = i2;
        this.A02 = lb2;
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void ADy(String str) {
        if (this.A00 > 0) {
            this.A01.ADy(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADy(str);
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void flush() {
        this.A02.flush();
    }
}
