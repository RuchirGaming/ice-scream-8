package com.facebook.ads.redexgen.X;

import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0877Bz {
    public static byte[] A03;
    public static String[] A04 = {"jNGyeOKibO3rZ", "Gh5JKt6GRlqFQi5f7wncYkOvXKUgvq3H", "CofAGDTz318WCwUORyk9cSrFfeh2Hkrj", "9nnBa0OOqYKGA4mW7JXlquoRY2XdVC9l", "SGv5o9U73t5KHQiabCNHP6atzf1gi70l", "Pw4XIo5raqSVixY1hwfj9nDYbuGZRESR", "ADqcQvt0hpjLC586x1ggUJbhpZ3DSlma", "N1vQLbUqrUUUOY9UOZX86MfJnRzuBUgh"};
    public static final long[] A05;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
                break;
            }
            A04[3] = "ZERhDI0eRTm5worZScrGBygyYS9gFskv";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 77);
            String[] strArr2 = A04;
            if (strArr2[4].charAt(6) != strArr2[7].charAt(6)) {
                break;
            }
            String[] strArr3 = A04;
            strArr3[6] = "5jMkCIwJgzdMCgzRGNs7rdJ4OYAUyBry";
            strArr3[2] = "xyMLmlHhB2f8Cz8kVUOrh9ZTHBCB3Rr0";
            i5++;
        }
        throw new RuntimeException();
    }

    public static void A03() {
        A03 = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 97, 46, 120, 111, 98, 103, 106, 46, 120, 111, 124, 103, 96, 122, 46, 98, 107, 96, 105, 122, 102, 46, 99, 111, 125, 101, 46, 104, 97, 123, 96, 106};
    }

    static {
        A03();
        A05 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = A05;
            int varIntLength = jArr.length;
            if (i3 >= varIntLength) {
                return -1;
            }
            if ((jArr[i3] & ((long) i2)) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    public static long A01(byte[] bArr, int i2, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            long j3 = A05[i2 - 1];
            String[] strArr = A04;
            if (strArr[5].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            A04[0] = "UDmiDfZ1LL8gM";
            j2 &= j3 ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            long j4 = j2 << 8;
            byte b2 = bArr[i3];
            if (A04[3].charAt(15) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "cm8OQheSofC6CbyPg1WnuKrHLhcydwvw";
            strArr2[2] = "ayPMvBCy6e1LCFJPDiyGHhHMjUGacyfS";
            long varint = b2;
            j2 = j4 | (varint & 255);
        }
        return j2;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(InterfaceC0861Bb interfaceC0861Bb, boolean z, boolean z2, int i2) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            if (!interfaceC0861Bb.AEE(this.A02, 0, 1, z)) {
                return -1L;
            }
            int firstByte = this.A02[0] & 255;
            int iA00 = A00(firstByte);
            this.A00 = iA00;
            if (iA00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 67));
            }
        }
        int i3 = this.A00;
        if (i3 > i2) {
            this.A01 = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC0861Bb.readFully(this.A02, 1, i3 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z2);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
