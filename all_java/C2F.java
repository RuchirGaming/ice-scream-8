package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C2F implements Serializable {
    public C2E A00;
    public C2E A01;

    public C2F() {
        this(0.5d, 0.5d);
    }

    public C2F(double d2) {
        this(d2, 0.5d);
    }

    public C2F(double d2, double d3) {
        this.A00 = new C2E(d2);
        this.A01 = new C2E(d3);
        A02();
    }

    public final C2E A00() {
        return this.A00;
    }

    public final C2E A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A06();
        this.A01.A06();
    }

    public final void A03() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A04(double d2, double d3) {
        this.A00.A08(d2, d3);
    }

    public final void A05(double d2, double d3) {
        this.A01.A08(d2, d3);
    }
}
