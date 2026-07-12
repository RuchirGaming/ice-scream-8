package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0883Cj {
    public static String[] A0G = {"pHpyHP8S", "m7Dm6DzF3JrYgJb8r3aBvOiHYZnTgqFt", "HDu7bLu972VfHIygI4M5b4TuY4lqC4yg", "iivH24vaI3kkb3LFmloVx1IOyWVuKza4", "KZ0yf6ou6J0TqVPjqp3i5DSivFyU8bNM", "Pc4fHgH2fAOt1gCYCPntkv807xx", "lUKVzHZS", "o3UNUm1DzZwOBzkgZiuDkjMNM5U"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C0997Hc A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C0883Cj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(C0883Cj c0883Cj) {
        if (this.A0F) {
            if (!c0883Cj.A0F || this.A03 != c0883Cj.A03 || this.A07 != c0883Cj.A07 || this.A0C != c0883Cj.A0C) {
                return true;
            }
            boolean z = this.A0B;
            String[] strArr = A0G;
            if (strArr[1].charAt(29) == strArr[4].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[7] = "XDMSMjR4OOJ5qpPgon6YqbblugR";
            strArr2[5] = "5xZUmDJH2T0z2hm3Lt8QCiFJvrf";
            if (z && c0883Cj.A0B && this.A0A != c0883Cj.A0A) {
                return true;
            }
            int i2 = this.A05;
            int i3 = c0883Cj.A05;
            if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                return true;
            }
            if (this.A09.A04 == 0 && c0883Cj.A09.A04 == 0 && (this.A06 != c0883Cj.A06 || this.A02 != c0883Cj.A02)) {
                return true;
            }
            if (this.A09.A04 == 1 && c0883Cj.A09.A04 == 1) {
                int i4 = this.A00;
                if (A0G[2].length() == 32) {
                    String[] strArr3 = A0G;
                    strArr3[7] = "XRlTxrvrNP0CnKRouPcFPiOcqOY";
                    strArr3[5] = "BA8SrIsjDMc450dTESwcliSODCW";
                    if (i4 != c0883Cj.A00) {
                        return true;
                    }
                } else if (i4 != c0883Cj.A00) {
                    return true;
                }
                if (this.A01 != c0883Cj.A01) {
                    return true;
                }
            }
            boolean z2 = this.A0E;
            boolean z3 = c0883Cj.A0E;
            if (z2 != z3) {
                return true;
            }
            if (z2 && z3 && this.A04 != c0883Cj.A04) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i2) {
        this.A08 = i2;
        this.A0D = true;
    }

    public final void A04(C0997Hc c0997Hc, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
        this.A09 = c0997Hc;
        this.A05 = i2;
        this.A08 = i3;
        this.A03 = i4;
        this.A07 = i5;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A0E = z4;
        this.A04 = i6;
        this.A06 = i7;
        this.A02 = i8;
        this.A00 = i9;
        this.A01 = i10;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        int i2;
        return this.A0D && ((i2 = this.A08) == 7 || i2 == 2);
    }
}
