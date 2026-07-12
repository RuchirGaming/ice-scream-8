package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0977Gg {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, -128, -50};
    }

    public C0977Gg(Uri uri, long j2, long j3, long j4, String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public C0977Gg(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    public C0977Gg(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, j2, j2, j3, str, i2);
    }

    public C0977Gg(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        HI.A03(j2 >= 0);
        HI.A03(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        HI.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A05 = str;
        this.A00 = i2;
    }

    public final boolean A02(int i2) {
        return (this.A00 & i2) == i2;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String strA00 = A00(0, 2, 66);
        return sbAppend.append(strA00).append(Arrays.toString(this.A06)).append(strA00).append(this.A01).append(strA00).append(this.A03).append(strA00).append(this.A02).append(strA00).append(this.A05).append(strA00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
