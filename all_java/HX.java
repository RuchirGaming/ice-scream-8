package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class HX {
    public static byte[] A02;
    public static String[] A03 = {"ufcJ2HAihJosUsaZFLNZtYY8", "bmlqQEKzdEWSmfzemHV42aEu6x62Jcg2", "qe0e3vE0", "cU6ka9kke0C1UssuXKKId6s3LH0TnDgR", "NBXEsDwyr5gxTvwsXm2VTXnbHZeH6Vn2", "9ROYvUVyiX7gohkAn481H2mOSrWfwkEW", "kg13vNZY", "wCuY9NPZDJo5EDMJHr19Ezs"};
    public int A00;
    public long[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 21);
            if (A03[5].charAt(4) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "qrOxj9WknsOFQ70fALMeLyi";
            strArr[0] = "P1AmcEUhDx5DKosu43I345dx";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{90, 78, -95, -105, -88, -109, 78, -105, -95, 78, -118, -81, -73, -94, -83, -86, -91, 97, -86, -81, -91, -90, -71, 97};
    }

    static {
        A01();
    }

    public HX() {
        this(32);
    }

    public HX(int i2) {
        this.A01 = new long[i2];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return this.A01[i2];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 44) + i2 + A00(0, 10, 25) + this.A00);
    }

    public final void A04(long j2) {
        int i2 = this.A00;
        long[] jArr = this.A01;
        if (i2 == jArr.length) {
            int i3 = i2 * 2;
            String[] strArr = A03;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "C4hqpLWZ";
            strArr2[2] = "upiEXy76";
            this.A01 = Arrays.copyOf(jArr, i3);
        }
        long[] jArr2 = this.A01;
        int i4 = this.A00;
        this.A00 = i4 + 1;
        jArr2[i4] = j2;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
