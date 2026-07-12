package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C08149f {
    public static final C08149f A04 = new C08149f(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C08149f(float f2) {
        this(f2, 1.0f, false);
    }

    public C08149f(float f2, float f3, boolean z) {
        HI.A03(f2 > 0.0f);
        HI.A03(f3 > 0.0f);
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f2);
    }

    public final long A00(long j2) {
        return ((long) this.A03) * j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C08149f c08149f = (C08149f) obj;
        return this.A01 == c08149f.A01 && this.A00 == c08149f.A00 && this.A02 == c08149f.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
