package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class G1 implements InterfaceC1579bk {
    public final List<InterfaceC1580bl> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1579bk
    public final InterfaceC1580bl A5m(int i2) {
        return this.A00.get(i2);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1580bl> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1579bk
    public final int size() {
        return this.A00.size();
    }
}
