package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C07164z {
    public C07134w A00 = new C07134w();
    public final InterfaceC07144x A01;

    public C07164z(InterfaceC07144x interfaceC07144x) {
        this.A01 = interfaceC07144x;
    }

    public final View A00(int i2, int i3, int i4, int i5) {
        int iA7T = this.A01.A7T();
        int next = this.A01.A7S();
        int childEnd = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewA6H = this.A01.A6H(i2);
            int iA6K = this.A01.A6K(viewA6H);
            int i6 = this.A01.A6J(viewA6H);
            this.A00.A03(iA7T, next, iA6K, i6);
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    return viewA6H;
                }
            }
            if (i5 != 0) {
                this.A00.A01();
                this.A00.A02(i5);
                if (this.A00.A04()) {
                    view = viewA6H;
                }
            }
            i2 += childEnd;
        }
        return view;
    }
}
