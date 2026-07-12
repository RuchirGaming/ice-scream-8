package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0868Bk {
    public static byte[] A02;
    public static final C0868Bk A03;
    public final long A00;
    public final long A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 126, 46, 49, 45, 55, 42, 55, 49, 48, 99, 50, 29, 0, 4, 12, 60, 26, 84, 102};
    }

    static {
        A01();
        A03 = new C0868Bk(0L, 0L);
    }

    public C0868Bk(long j2, long j3) {
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
        C0868Bk c0868Bk = (C0868Bk) obj;
        return this.A01 == c0868Bk.A01 && this.A00 == c0868Bk.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 83) + this.A01 + A00(0, 11, 100) + this.A00 + A00(19, 1, 1);
    }
}
