package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0885Cm {
    public static String[] A05 = {"iFsZT", "GIrwtjs5Y9yKRnQprRliKFssvnZ626eg", "zaANWFIQpg9VP0PHXhMzOh2uHy4vuPX", "SXuHzyzb5Klrd", "166Epp2tdWdGB7BvYI0", "pZQUhJ", "kvzgTqzGY4juGUAH8hr6m1KZDAgAa2C", "eJKNB8bktVjQii80zBcR1gNx5SzXp2s0"};
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public C0885Cm(int i2, int i3) {
        this.A04 = i2;
        byte[] bArr = new byte[i3 + 3];
        this.A01 = bArr;
        bArr[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i2) {
        HI.A04(!this.A03);
        boolean z = i2 == this.A04;
        this.A03 = z;
        if (z) {
            this.A00 = 3;
            this.A02 = false;
        }
    }

    public final void A02(byte[] bArr, int i2, int i3) {
        if (!this.A03) {
            return;
        }
        int i4 = i3 - i2;
        byte[] bArr2 = this.A01;
        int length = bArr2.length;
        int i5 = this.A00;
        int readLength = i5 + i4;
        if (length < readLength) {
            int readLength2 = (i5 + i4) * 2;
            this.A01 = Arrays.copyOf(bArr2, readLength2);
        }
        byte[] bArr3 = this.A01;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i2, bArr3, readLength3, i4);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i4;
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i2) {
        if (!this.A03) {
            return false;
        }
        int i3 = this.A00;
        String[] strArr = A05;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[0] = "YBe0L";
        strArr2[4] = "0OBHzAzgulxKkAZ8kiy";
        this.A00 = i3 - i2;
        this.A03 = false;
        this.A02 = true;
        return true;
    }
}
