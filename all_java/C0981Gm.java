package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C0981Gm extends IOException {
    public final int A00;
    public final C0977Gg A01;

    public C0981Gm(IOException iOException, C0977Gg c0977Gg, int i2) {
        super(iOException);
        this.A01 = c0977Gg;
        this.A00 = i2;
    }

    public C0981Gm(String str, C0977Gg c0977Gg, int i2) {
        super(str);
        this.A01 = c0977Gg;
        this.A00 = i2;
    }

    public C0981Gm(String str, IOException iOException, C0977Gg c0977Gg, int i2) {
        super(str, iOException);
        this.A01 = c0977Gg;
        this.A00 = i2;
    }
}
