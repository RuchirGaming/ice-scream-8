package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public abstract class AbstractC1573be {
    public InterfaceC1574bf A00;

    public final void A00() {
        InterfaceC1574bf interfaceC1574bf = this.A00;
        if (interfaceC1574bf != null) {
            interfaceC1574bf.onStart();
        }
    }

    public final void A01() {
        InterfaceC1574bf interfaceC1574bf = this.A00;
        if (interfaceC1574bf != null) {
            interfaceC1574bf.onStop();
        }
    }

    public final void A02(InterfaceC1574bf interfaceC1574bf) {
        this.A00 = interfaceC1574bf;
    }
}
