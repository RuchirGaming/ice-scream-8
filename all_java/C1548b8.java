package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1548b8 implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1548b8(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ADc(int i2) throws C1547b7 {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1547b7 {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1547b7 {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1547b7 {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
