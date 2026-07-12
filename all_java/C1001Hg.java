package com.facebook.ads.redexgen.X;

import androidx.core.view.MotionEventCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1001Hg {
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C1001Hg() {
    }

    public C1001Hg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C1001Hg(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A02 = i2;
    }

    private void A00() {
        int i2;
        int i3 = this.A03;
        HI.A04(i3 >= 0 && (i3 < (i2 = this.A02) || (i3 == i2 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        HI.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        int i4 = 0;
        this.A01 += i2;
        while (true) {
            i3 = this.A01;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.A01 = i5;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i4 |= (bArr[returnValue] & 255) << i5;
        }
        byte[] bArr2 = this.A00;
        int i6 = this.A03;
        int returnValue2 = bArr2[i6] & 255;
        int i7 = i4 | (returnValue2 >> (8 - i3));
        int returnValue3 = 32 - i2;
        int i8 = i7 & ((-1) >>> returnValue3);
        if (i3 == 8) {
            this.A01 = 0;
            this.A03 = i6 + 1;
        }
        A00();
        return i8;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i2 = this.A01 + 1;
        this.A01 = i2;
        if (i2 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i2) {
        int i3 = i2 / 8;
        this.A03 = i3;
        this.A01 = i2 - (i3 * 8);
        A00();
    }

    public final void A08(int i2) {
        int numBytes = i2 / 8;
        int i3 = this.A03 + numBytes;
        this.A03 = i3;
        int i4 = this.A01 + (i2 - (numBytes * 8));
        this.A01 = i4;
        if (i4 > 7) {
            this.A03 = i3 + 1;
            this.A01 = i4 - 8;
        }
        A00();
    }

    public final void A09(int i2) {
        HI.A04(this.A01 == 0);
        this.A03 += i2;
        A00();
    }

    public final void A0A(int firstByteInputBits, int i2) {
        if (i2 < 32) {
            firstByteInputBits &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.A01, i2);
        int remainingBitsToRead = this.A01;
        int firstByteRightPaddingSize = (8 - remainingBitsToRead) - iMin;
        int firstByteReadSize = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead;
        int firstByteReadSize2 = firstByteReadSize | ((1 << firstByteRightPaddingSize) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        byte b2 = (byte) (bArr[firstByteBitmask] & firstByteReadSize2);
        bArr[firstByteBitmask] = b2;
        int firstByteReadSize3 = b2 | ((firstByteInputBits >>> (i2 - iMin)) << firstByteRightPaddingSize);
        bArr[firstByteBitmask] = (byte) firstByteReadSize3;
        int firstByteRightPaddingSize2 = i2 - iMin;
        int firstByteBitmask2 = firstByteBitmask + 1;
        while (firstByteRightPaddingSize2 > 8) {
            int firstByteReadSize4 = firstByteBitmask2 + 1;
            this.A00[firstByteBitmask2] = (byte) (firstByteInputBits >>> (firstByteRightPaddingSize2 - 8));
            firstByteRightPaddingSize2 -= 8;
            firstByteBitmask2 = firstByteReadSize4;
        }
        int lastByteRightPaddingSize = 8 - firstByteRightPaddingSize2;
        byte[] bArr2 = this.A00;
        int firstByteReadSize5 = bArr2[firstByteBitmask2];
        byte b3 = (byte) (firstByteReadSize5 & ((1 << lastByteRightPaddingSize) - 1));
        bArr2[firstByteBitmask2] = b3;
        int firstByteReadSize6 = b3 | ((firstByteInputBits & ((1 << firstByteRightPaddingSize2) - 1)) << lastByteRightPaddingSize);
        bArr2[firstByteBitmask2] = (byte) firstByteReadSize6;
        A08(i2);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i2) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i2;
    }

    public final void A0D(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.A00;
            int to = this.A03;
            int i5 = to + 1;
            this.A03 = i5;
            int to2 = bArr2[to];
            int i6 = this.A01;
            bArr[i2] = (byte) (to2 << i6);
            int i7 = bArr[i2];
            int to3 = bArr2[i5];
            bArr[i2] = (byte) (((255 & to3) >> (8 - i6)) | i7);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        int bitsLeft = bArr[i4];
        int to4 = 255 >> i8;
        bArr[i4] = (byte) (bitsLeft & to4);
        int i9 = this.A01;
        int to5 = i9 + i8;
        if (to5 > 8) {
            int i10 = bArr[i4];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i4] = (byte) (i10 | ((to7 & 255) << i9));
            this.A01 = i9 - 8;
        }
        int i11 = this.A01 + i8;
        this.A01 = i11;
        byte[] bArr4 = this.A00;
        int lastDataByteTrailingBits = this.A03;
        int to8 = bArr4[lastDataByteTrailingBits];
        int i12 = 255 & to8;
        int to9 = 8 - i11;
        int i13 = i12 >> to9;
        int bitsLeft3 = bArr[i4];
        int to10 = 8 - i8;
        bArr[i4] = (byte) (bitsLeft3 | ((byte) (i13 << to10)));
        if (i11 == 8) {
            this.A01 = 0;
            int to11 = lastDataByteTrailingBits + 1;
            this.A03 = to11;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i2, int i3) {
        HI.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i2, i3);
        this.A03 += i3;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
