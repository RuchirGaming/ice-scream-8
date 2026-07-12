package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C08309v {
    public static final C08309v A02;
    public static final C08309v A03;
    public static final C08309v A04;
    public static final C08309v A05;
    public static final C08309v A06;
    public final long A00;
    public final long A01;

    static {
        C08309v c08309v = new C08309v(0L, 0L);
        A04 = c08309v;
        A02 = new C08309v(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new C08309v(Long.MAX_VALUE, 0L);
        A05 = new C08309v(0L, Long.MAX_VALUE);
        A03 = c08309v;
    }

    public C08309v(long j2, long j3) {
        HI.A03(j2 >= 0);
        HI.A03(j3 >= 0);
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C08309v c08309v = (C08309v) obj;
        return this.A01 == c08309v.A01 && this.A00 == c08309v.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
