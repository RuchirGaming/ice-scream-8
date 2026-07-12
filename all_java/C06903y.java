package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C06903y {
    public static byte[] A02;
    public static String[] A03 = {"bULQ32o9JJN83aCucFVWf9xMaMFfdsau", "BEVDZxUetTHXZyMQk8onv0fPj1ZBZ1Qa", "0vYpub5LBkfCpAgXclsnPo1", "vVWBcEJQjEsfNalmzVe1r7miASaPIW1B", "LFkzDQh", "g5RhG8eWHWtWI7ENz9qYtKd", "50dEOoYhOQRa91fvkd77j3svvS12NHRj", "eQbNRdF"};
    public long A00 = 0;
    public C06903y A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -34};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C06903y();
        }
    }

    public final int A03(int i2) {
        C06903y c06903y = this.A01;
        if (c06903y == null) {
            if (i2 >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.A00 & ((1 << i2) - 1));
        }
        return c06903y.A03(i2 - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        C06903y c06903y = this.A01;
        if (c06903y != null) {
            c06903y.A04();
        }
    }

    public final void A05(int i2) {
        if (i2 >= 64) {
            C06903y c06903y = this.A01;
            if (c06903y != null) {
                c06903y.A05(i2 - 64);
                return;
            }
            return;
        }
        long j2 = this.A00 & ((1 << i2) ^ (-1));
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "FQtQPqX5zshXn4VmNwTVsnzPJS3Krcw4";
        strArr[3] = "mEVd87EgPvtBoIzzDeJnjIPIOSUL2jIs";
        this.A00 = j2;
    }

    public final void A06(int i2) {
        if (i2 >= 64) {
            A01();
            this.A01.A06(i2 - 64);
        } else {
            this.A00 |= 1 << i2;
        }
    }

    public final void A07(int i2, boolean z) {
        if (i2 >= 64) {
            A01();
            this.A01.A07(i2 - 64, z);
            return;
        }
        long j2 = this.A00;
        boolean z2 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.A00 = (j2 & j3) | ((j2 & ((-1) ^ j3)) << 1);
        if (z) {
            A06(i2);
        } else {
            A05(i2);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z2);
    }

    public final boolean A08(int i2) {
        if (i2 < 64) {
            return (this.A00 & (1 << i2)) != 0;
        }
        A01();
        return this.A01.A08(i2 - 64);
    }

    public final boolean A09(int i2) {
        if (i2 >= 64) {
            A01();
            return this.A01.A09(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.A00;
        boolean z = (j3 & j2) != 0;
        long j4 = j3 & (j2 ^ (-1));
        this.A00 = j4;
        long j5 = j2 - 1;
        long mask = j4 & j5;
        long before = Long.rotateRight(j4 & ((-1) ^ j5), 1);
        this.A00 = mask | before;
        C06903y c06903y = this.A01;
        if (c06903y != null) {
            if (c06903y.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z;
    }

    public final String toString() {
        if (this.A01 != null) {
            return this.A01.toString() + A00(0, 2, 97) + Long.toBinaryString(this.A00);
        }
        long j2 = this.A00;
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "hJ9KUEYMHtIt6rT1Ez0KfdL";
        strArr[5] = "B6CHA8tZa8vt0H5l4hWvu9Y";
        return Long.toBinaryString(j2);
    }
}
