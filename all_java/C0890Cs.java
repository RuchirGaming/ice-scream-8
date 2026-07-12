package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0890Cs {
    public final int A00;
    public final String A01;
    public final List<C0889Cr> A02;
    public final byte[] A03;

    public C0890Cs(int i2, String str, List<C0889Cr> list, byte[] bArr) {
        List<C0889Cr> listUnmodifiableList;
        this.A00 = i2;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
