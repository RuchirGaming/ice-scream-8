package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class G6 {
    public static byte[] A0A;
    public static String[] A0B = {"Hprt8nz5MObb9HHRcJ3FgjC39pyTAkMZ", "YXvL2uxtzClfHFg6aAVmg", "8", "bmP4Y2GubreqcLziMdkO7o6qdrqKBqYT", "xlpbHyPtEfmAimLN7HKZ9Bono5vlwWgn", "LwCpz6scIEYomVha95M6oDYa7jl1evxR", "a2CW8B1wV2q0m", "yioJoIaiBMoPM1KevDFnpDPEbZrt8c"};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-24, 1, 5, -8, -10, 2, -6, 1, -4, 13, -8, -9, -77, -12, -1, -4, -6, 1, 0, -8, 1, 7, -51, -77, 19, 33, 30, 50, 48, 48, -1, 49, 33, -2, 49, 37, 40, 32, 33, 46};
    }

    static {
        A02();
    }

    public G6() {
        A0E();
    }

    private G6 A00() {
        if (this.A08 == null) {
            this.A05 = Integer.MIN_VALUE;
        } else {
            int[] iArr = G5.A00;
            Layout.Alignment alignment = this.A08;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "bCWwshxvDhk0rmOpw86rGll2BB1o8fjY";
            strArr2[4] = "DFJ4JiMQubAonbmcG28FkdzFP9vzggDF";
            switch (iArr[alignment.ordinal()]) {
                case 1:
                    this.A05 = 0;
                    break;
                case 2:
                    this.A05 = 1;
                    break;
                case 3:
                    this.A05 = 2;
                    break;
                default:
                    Log.w(A01(24, 16, 111), A01(0, 24, 70) + this.A08);
                    this.A05 = 0;
                    break;
            }
        }
        return this;
    }

    public final G6 A03(float f2) {
        this.A00 = f2;
        return this;
    }

    public final G6 A04(float f2) {
        this.A01 = f2;
        return this;
    }

    public final G6 A05(float f2) {
        this.A02 = f2;
        return this;
    }

    public final G6 A06(int i2) {
        this.A03 = i2;
        return this;
    }

    public final G6 A07(int i2) {
        this.A04 = i2;
        return this;
    }

    public final G6 A08(int i2) {
        this.A05 = i2;
        return this;
    }

    public final G6 A09(long j2) {
        this.A06 = j2;
        return this;
    }

    public final G6 A0A(long j2) {
        this.A07 = j2;
        return this;
    }

    public final G6 A0B(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final G6 A0C(SpannableStringBuilder spannableStringBuilder) {
        this.A09 = spannableStringBuilder;
        return this;
    }

    public final VR A0D() {
        if (this.A01 != Float.MIN_VALUE && this.A05 == Integer.MIN_VALUE) {
            A00();
        }
        return new VR(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public final void A0E() {
        this.A07 = 0L;
        this.A06 = 0L;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = Integer.MIN_VALUE;
        this.A03 = Integer.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        this.A05 = Integer.MIN_VALUE;
        this.A02 = Float.MIN_VALUE;
    }
}
