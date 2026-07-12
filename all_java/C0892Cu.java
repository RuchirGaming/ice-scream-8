package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0892Cu {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{12, 24, 26, 17, 26, 13, 30, 11, 26, 49, 26, 8, 54, 27, 87, 86, 95, 18, 10, 12, 11, 95, 29, 26, 95, 28, 30, 19, 19, 26, 27, 95, 29, 26, 25, 16, 13, 26, 95, 13, 26, 11, 13, 22, 26, 9, 22, 17, 24, 95, 22, 27, 12, 81};
    }

    public C0892Cu(int i2, int i3) {
        this(Integer.MIN_VALUE, i2, i3);
    }

    public C0892Cu(int i2, int i3, int i4) {
        this.A04 = i2 != Integer.MIN_VALUE ? i2 + A00(0, 1, 31) : A00(0, 0, 77);
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = Integer.MIN_VALUE;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 67));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        int i2 = this.A00;
        this.A00 = i2 == Integer.MIN_VALUE ? this.A02 : i2 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
