package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public abstract class AbstractC1491aD implements C6I {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1491aD(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A01(true);
    }
}
