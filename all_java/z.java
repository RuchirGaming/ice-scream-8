package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class z {
    private byte[] tf;
    private int uW;
    private int uX;
    private int uY;

    public z(byte[] bArr, int i2, int i3) {
        s(bArr, i2, i3);
    }

    public void s(byte[] bArr, int i2, int i3) {
        this.tf = bArr;
        this.uX = i2;
        this.uW = i3;
        this.uY = 0;
        im();
    }

    public void ph() {
        int i2 = this.uY + 1;
        this.uY = i2;
        if (i2 == 8) {
            this.uY = 0;
            int i3 = this.uX;
            this.uX = i3 + (fE(i3 + 1) ? 2 : 1);
        }
        im();
    }

    public void bR(int i2) {
        int i3 = this.uX;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.uX = i5;
        int i6 = this.uY + (i2 - (i4 * 8));
        this.uY = i6;
        if (i6 > 7) {
            this.uX = i5 + 1;
            this.uY = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.uX) {
                if (fE(i3)) {
                    this.uX++;
                    i3 += 2;
                }
            } else {
                im();
                return;
            }
        }
    }

    public boolean fD(int i2) {
        int i3 = this.uX;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.uY + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.uW) {
                break;
            }
            if (fE(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.uW;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public boolean ik() {
        boolean z = (this.tf[this.uX] & (128 >> this.uY)) != 0;
        ph();
        return z;
    }

    public int bQ(int i2) {
        int i3;
        this.uY += i2;
        int i4 = 0;
        while (true) {
            i3 = this.uY;
            int i5 = 2;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.uY = i6;
            byte[] bArr = this.tf;
            int i7 = this.uX;
            i4 |= (bArr[i7] & 255) << i6;
            if (!fE(i7 + 1)) {
                i5 = 1;
            }
            this.uX = i7 + i5;
        }
        byte[] bArr2 = this.tf;
        int i8 = this.uX;
        int i9 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i8] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.uY = 0;
            this.uX = i8 + (fE(i8 + 1) ? 2 : 1);
        }
        im();
        return i9;
    }

    public boolean pL() {
        int i2 = this.uX;
        int i3 = this.uY;
        int i4 = 0;
        while (this.uX < this.uW && !ik()) {
            i4++;
        }
        boolean z = this.uX == this.uW;
        this.uX = i2;
        this.uY = i3;
        return !z && fD((i4 * 2) + 1);
    }

    public int pM() {
        return pO();
    }

    public int pN() {
        int iPO = pO();
        return (iPO % 2 == 0 ? -1 : 1) * ((iPO + 1) / 2);
    }

    private int pO() {
        int i2 = 0;
        while (!ik()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? bQ(i2) : 0);
    }

    private boolean fE(int i2) {
        if (2 <= i2 && i2 < this.uW) {
            byte[] bArr = this.tf;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private void im() {
        int i2;
        int i3 = this.uX;
        a.checkState(i3 >= 0 && (i3 < (i2 = this.uW) || (i3 == i2 && this.uY == 0)));
    }
}
