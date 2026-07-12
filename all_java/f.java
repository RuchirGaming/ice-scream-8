package com.applovin.exoplayer2.f;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
final class f {
    private int[] Hi;
    private int Hj;
    private int Hg = 0;
    private int Hh = -1;
    private int oW = 0;

    public f() {
        int[] iArr = new int[16];
        this.Hi = iArr;
        this.Hj = iArr.length - 1;
    }

    public void cR(int i2) {
        if (this.oW == this.Hi.length) {
            jU();
        }
        int i3 = (this.Hh + 1) & this.Hj;
        this.Hh = i3;
        this.Hi[i3] = i2;
        this.oW++;
    }

    public int jT() {
        int i2 = this.oW;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.Hi;
        int i3 = this.Hg;
        int i4 = iArr[i3];
        this.Hg = (i3 + 1) & this.Hj;
        this.oW = i2 - 1;
        return i4;
    }

    public boolean isEmpty() {
        return this.oW == 0;
    }

    public void clear() {
        this.Hg = 0;
        this.Hh = -1;
        this.oW = 0;
    }

    private void jU() {
        int[] iArr = this.Hi;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i2 = this.Hg;
        int i3 = length2 - i2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.Hi, 0, iArr2, i3, i2);
        this.Hg = 0;
        this.Hh = this.oW - 1;
        this.Hi = iArr2;
        this.Hj = iArr2.length - 1;
    }
}
