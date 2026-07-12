package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    public final void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public final boolean readBit() {
        boolean z = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z;
    }

    public final int readBits(int i2) {
        int i3 = this.byteOffset;
        int iMin = Math.min(i2, 8 - this.bitOffset);
        int i4 = i3 + 1;
        int i5 = ((this.data[i3] & 255) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.data[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        skipBits(i2);
        return i6;
    }

    public final void skipBits(int i2) {
        int i3 = i2 / 8;
        int i4 = this.byteOffset + i3;
        this.byteOffset = i4;
        int i5 = this.bitOffset + (i2 - (i3 * 8));
        this.bitOffset = i5;
        if (i5 > 7) {
            this.byteOffset = i4 + 1;
            this.bitOffset = i5 - 8;
        }
        assertValidOffset();
    }

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final void setPosition(int i2) {
        int i3 = i2 / 8;
        this.byteOffset = i3;
        this.bitOffset = i2 - (i3 * 8);
        assertValidOffset();
    }

    public final int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }
}
