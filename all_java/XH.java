package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class XH implements AJ {
    public static String[] A0E = {"fmVPqkFD1cgVEf5yEceID3qk2mv0y9jV", "b0qKN8vCZijgotAYoetPmKMmgBOh17e", "g7TZXYRzX5Z2yGc3Q7ZfgtgqT", "qnhKgbP1LxOTukF1AVGitzUWI170z7Sc", "gLdsa9A", "GaZA", "7VW9", "auyYkXCiGRTQJpd2YduJgHCR"};
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = AJ.A00;
    public ByteBuffer A08 = AJ.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    private int A00(long j2) {
        return (int) ((((long) this.A04) * j2) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= i; iLimit -= 2) {
            int i2 = byteBuffer.get(iLimit);
            if (Math.abs(i2) > 4) {
                int i3 = this.A00;
                int i4 = ((iLimit / i3) * i3) + i3;
                String[] strArr = A0E;
                String str = strArr[4];
                String str2 = strArr[1];
                int length = str.length();
                int i5 = str2.length();
                if (length == i5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[4] = "SOTn58r";
                strArr2[1] = "mEuLJiBevsWuJD71nrz4KbfWqLj7leU";
                return i4;
            }
        }
        int i6 = byteBuffer.position();
        return i6;
    }

    private int A02(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < i; iPosition += 2) {
            int i2 = byteBuffer.get(iPosition);
            if (Math.abs(i2) > 4) {
                int i3 = this.A00;
                return i3 * (iPosition / i3);
            }
        }
        int i4 = byteBuffer.limit();
        return i4;
    }

    private void A03(int i2) {
        if (this.A07.capacity() < i2) {
            this.A07 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i2 > 0) {
            this.A0A = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        A03(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int iPosition = maybeSilenceBufferRemaining - byteBuffer.position();
        byte[] bArr = this.A0C;
        int noisePosition = bArr.length;
        int limit = this.A02;
        int noisePosition2 = noisePosition - limit;
        if (maybeSilenceBufferRemaining < iLimit && iPosition < noisePosition2) {
            A09(bArr, limit);
            this.A02 = 0;
            String[] strArr = A0E;
            String str = strArr[7];
            String str2 = strArr[2];
            int noisePosition3 = str.length();
            if (noisePosition3 == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "O6VD7siumNrk7CVoottqf9Wd";
            strArr2[2] = "eko4kK9cp1fEhg6H4c3WRP0k0";
            this.A05 = 0;
            return;
        }
        int maybeSilenceInputSize = Math.min(iPosition, noisePosition2);
        byteBuffer.limit(byteBuffer.position() + maybeSilenceInputSize);
        byteBuffer.get(this.A0C, this.A02, maybeSilenceInputSize);
        int i2 = this.A02 + maybeSilenceInputSize;
        this.A02 = i2;
        byte[] bArr2 = this.A0C;
        if (i2 == bArr2.length) {
            if (this.A0A) {
                A09(bArr2, this.A03);
                long j2 = this.A06;
                int noisePosition4 = this.A02;
                this.A06 = j2 + ((long) ((noisePosition4 - (this.A03 * 2)) / this.A00));
            } else {
                this.A06 += (long) ((i2 - this.A03) / this.A00);
            }
            A08(byteBuffer, this.A0C, this.A02);
            this.A02 = 0;
            this.A05 = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int limit = this.A0C.length;
        byteBuffer.limit(Math.min(iLimit, iPosition + limit));
        int noiseLimit = A01(byteBuffer);
        int limit2 = byteBuffer.position();
        if (noiseLimit == limit2) {
            this.A05 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A04(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A07(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        long j2 = this.A06;
        int noisyPosition = byteBuffer.remaining();
        int limit = this.A00;
        this.A06 = j2 + ((long) (noisyPosition / limit));
        byte[] bArr = this.A0D;
        int limit2 = this.A03;
        A08(byteBuffer, bArr, limit2);
        if (iA02 < iLimit) {
            byte[] bArr2 = this.A0D;
            int limit3 = this.A03;
            A09(bArr2, limit3);
            this.A05 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A08(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.A03);
        int i3 = this.A03 - iMin;
        System.arraycopy(bArr, i2 - i3, this.A0D, 0, i3);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - iMin);
        byteBuffer.get(this.A0D, i3, iMin);
    }

    private void A09(byte[] bArr, int i2) {
        A03(i2);
        this.A07.put(bArr, 0, i2);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0A() {
        return this.A06;
    }

    public final void A0B(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A4N(int i2, int i3, int i4) throws AI {
        if (i4 == 2) {
            if (this.A04 == i2 && this.A01 == i3) {
                return false;
            }
            this.A04 = i2;
            this.A01 = i3;
            this.A00 = i3 * 2;
            return true;
        }
        throw new AI(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final ByteBuffer A7O() {
        ByteBuffer byteBuffer = this.A08;
        ByteBuffer outputBuffer = AJ.A00;
        this.A08 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7Q() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7R() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8l() {
        return this.A04 != -1 && this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8q() {
        return this.A0B && this.A08 == AJ.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE6() {
        this.A0B = true;
        int i2 = this.A02;
        if (i2 > 0) {
            A09(this.A0C, i2);
        }
        if (!this.A0A) {
            long j2 = this.A06;
            int i3 = this.A03 / this.A00;
            String[] strArr = A0E;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "We9PvBsbdasK7tn9VyyhVUkeOk007ymd";
            strArr2[3] = "bdBvwmZlOtVUMyUHuHiUMKijb9L0xmkD";
            this.A06 = j2 + ((long) i3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE7(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            switch (this.A05) {
                case 0:
                    A06(byteBuffer);
                    break;
                case 1:
                    A05(byteBuffer);
                    break;
                case 2:
                    A07(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void flush() {
        if (A8l()) {
            int iA00 = A00(150000L) * this.A00;
            int maybeSilenceBufferSize = this.A0C.length;
            if (maybeSilenceBufferSize != iA00) {
                this.A0C = new byte[iA00];
            }
            int iA01 = A00(20000L);
            int maybeSilenceBufferSize2 = this.A00;
            int i2 = iA01 * maybeSilenceBufferSize2;
            this.A03 = i2;
            int maybeSilenceBufferSize3 = this.A0D.length;
            if (maybeSilenceBufferSize3 != i2) {
                this.A0D = new byte[i2];
            }
        }
        this.A05 = 0;
        this.A08 = AJ.A00;
        this.A0B = false;
        this.A06 = 0L;
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = AJ.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
