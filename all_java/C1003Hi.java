package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1003Hi {
    public static String[] A04 = {"BtHKr", "GAfuq", "1TcIbYyYGpE6Ekv4glvvfZz9bC", "q9fmd3d0ImW5Daxca", "ooOXUvpeMSptobOLnq6qd7gNdq", "VwsWXVZM3brBJlmy9", "pSziVAe", "zUHU2CyO73eexnRwL2LOOWJW4Jr0bcWv"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1003Hi(byte[] bArr, int i2, int i3) {
        A08(bArr, i2, i3);
    }

    private int A00() {
        int i2 = 0;
        while (!A0A()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        int leadingZeros = i2 > 0 ? A05(i2) : 0;
        return i3 + leadingZeros;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    private void A01() {
        boolean z;
        int i2 = this.A02;
        if (i2 >= 0) {
            int i3 = this.A01;
            if (A04[1].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "f06qvbC";
            strArr[0] = "HuIz9";
            if (i2 < i3 || (i2 == i3 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        HI.A04(z);
    }

    private boolean A02(int i2) {
        if (2 <= i2 && i2 < this.A01) {
            byte[] bArr = this.A03;
            byte b2 = bArr[i2];
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A04;
                strArr2[5] = "Jod3dkhqFQ8qWj2s5";
                strArr2[3] = "0zxF2BZpdiUX5xaGz";
                if (b2 == 3 && bArr[i2 - 2] == 0) {
                    byte b3 = bArr[i2 - 1];
                    String[] strArr3 = A04;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        String[] strArr4 = A04;
                        strArr4[6] = "lQKXp2Z";
                        strArr4[0] = "Kosug";
                        if (b3 == 0) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int A03() {
        int iA00 = A00();
        int codeNum = iA00 % 2;
        int i2 = codeNum == 0 ? -1 : 1;
        int codeNum2 = iA00 + 1;
        return i2 * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i2) {
        int i3;
        int i4 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i2;
        while (true) {
            i3 = this.A00;
            int i5 = 2;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.A00 = i6;
            byte[] bArr = this.A03;
            int i7 = this.A02;
            int returnValue2 = bArr[i7];
            i4 |= (returnValue2 & 255) << i6;
            int returnValue3 = i7 + 1;
            if (!A02(returnValue3)) {
                i5 = 1;
            }
            this.A02 = i7 + i5;
        }
        byte[] bArr2 = this.A03;
        int i8 = this.A02;
        int returnValue4 = bArr2[i8];
        int i9 = returnValue4 & 255;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[3];
        int length = str.length();
        int returnValue5 = str2.length();
        if (length != returnValue5) {
            throw new RuntimeException();
        }
        A04[7] = "CI85ryy9UuGcWp4q0bXmx78DrLL4QG6i";
        int returnValue6 = 8 - i3;
        int i10 = i4 | (i9 >> returnValue6);
        int returnValue7 = (-1) >>> (32 - i2);
        int i11 = i10 & returnValue7;
        if (i3 == 8) {
            this.A00 = 0;
            int returnValue8 = i8 + 1;
            this.A02 = i8 + (A02(returnValue8) ? 2 : 1);
        }
        A01();
        return i11;
    }

    public final void A06() {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            int i3 = this.A02;
            this.A02 = i3 + (A02(i3 + 1) ? 2 : 1);
        }
        A01();
    }

    public final void A07(int i2) {
        int i3 = this.A02;
        int oldByteOffset = i2 / 8;
        int numBytes = this.A02 + oldByteOffset;
        this.A02 = numBytes;
        int i4 = this.A00 + (i2 - (oldByteOffset * 8));
        this.A00 = i4;
        if (i4 > 7) {
            int i5 = numBytes + 1;
            String[] strArr = A04;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "WKnUhbHg5PXpVOXLjQbslPOixC";
            strArr2[4] = "5elOCNAU3UTje1WUqtoqjArHkZ";
            this.A02 = i5;
            this.A00 = i4 - 8;
        }
        int numBytes2 = i3 + 1;
        while (numBytes2 <= this.A02) {
            if (A02(numBytes2)) {
                this.A02++;
                numBytes2 += 2;
            }
            numBytes2++;
        }
        A01();
    }

    public final void A08(byte[] bArr, int i2, int i3) {
        this.A03 = bArr;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i4++;
        }
        int i5 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i5 == initialByteOffset ? 1 : 0;
        this.A02 = i2;
        this.A00 = i3;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i4 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i2) {
        int numBytes = this.A02;
        int oldByteOffset = i2 / 8;
        int i3 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i2) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i3++;
            newBitOffset -= 8;
        }
        int newByteOffset = numBytes + 1;
        while (newByteOffset <= i3 && i3 < this.A01) {
            if (A02(newByteOffset)) {
                i3++;
                newByteOffset += 2;
            }
            newByteOffset++;
        }
        int oldByteOffset2 = this.A01;
        if (i3 >= oldByteOffset2) {
            return i3 == oldByteOffset2 && newBitOffset == 0;
        }
        return true;
    }
}
