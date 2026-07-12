package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2K, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C2K implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C2K A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C2K> A04;

    public C2K(int i2, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i2;
        this.A03 = str;
        this.A02 = str2;
    }

    public C2K(String str) {
        this(0, null, str);
    }

    private void A00(C2K c2k) {
        this.A00 = c2k;
    }

    public final int A01() {
        return this.A01;
    }

    public final C2K A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C2K> A05() {
        return this.A04;
    }

    public final void A06(C2K c2k) {
        c2k.A00(this);
        this.A04.add(c2k);
    }
}
