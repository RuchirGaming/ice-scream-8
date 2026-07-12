package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i2, int i3) {
        reset(bArr, i2, i3);
    }

    public final void reset(byte[] bArr, int i2, int i3) {
        this.data = bArr;
        this.byteOffset = i2;
        this.byteLimit = i3;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public final void skipBit() {
        int i2 = this.bitOffset + 1;
        this.bitOffset = i2;
        if (i2 == 8) {
            this.bitOffset = 0;
            int i3 = this.byteOffset;
            this.byteOffset = i3 + (shouldSkipByte(i3 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public final void skipBits(int i2) {
        int i3 = this.byteOffset;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.byteOffset = i5;
        int i6 = this.bitOffset + (i2 - (i4 * 8));
        this.bitOffset = i6;
        if (i6 > 7) {
            this.byteOffset = i5 + 1;
            this.bitOffset = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.byteOffset) {
                if (shouldSkipByte(i3)) {
                    this.byteOffset++;
                    i3 += 2;
                }
            } else {
                assertValidOffset();
                return;
            }
        }
    }

    public final boolean canReadBits(int i2) {
        int i3 = this.byteOffset;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.bitOffset + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.byteLimit;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public final boolean readBit() {
        boolean z = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z;
    }

    public final int readBits(int i2) {
        int i3;
        this.bitOffset += i2;
        int i4 = 0;
        while (true) {
            i3 = this.bitOffset;
            int i5 = 2;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.bitOffset = i6;
            byte[] bArr = this.data;
            int i7 = this.byteOffset;
            i4 |= (bArr[i7] & 255) << i6;
            if (!shouldSkipByte(i7 + 1)) {
                i5 = 1;
            }
            this.byteOffset = i7 + i5;
        }
        byte[] bArr2 = this.data;
        int i8 = this.byteOffset;
        int i9 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i8] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i8 + (shouldSkipByte(i8 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i9;
    }

    public final boolean canReadExpGolombCodedNum() {
        int i2 = this.byteOffset;
        int i3 = this.bitOffset;
        int i4 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i4++;
        }
        boolean z = this.byteOffset == this.byteLimit;
        this.byteOffset = i2;
        this.bitOffset = i3;
        return !z && canReadBits((i4 * 2) + 1);
    }

    public final int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public final int readSignedExpGolombCodedInt() {
        int expGolombCodeNum = readExpGolombCodeNum();
        return (expGolombCodeNum % 2 == 0 ? -1 : 1) * ((expGolombCodeNum + 1) / 2);
    }

    private int readExpGolombCodeNum() {
        int i2 = 0;
        while (!readBit()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? readBits(i2) : 0);
    }

    private boolean shouldSkipByte(int i2) {
        if (2 <= i2 && i2 < this.byteLimit) {
            byte[] bArr = this.data;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }
}
