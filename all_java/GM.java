package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class GM {

    @Deprecated
    public final int A00;
    public final int A01;
    public final TrackGroupArray A02;
    public final int[] A03;
    public final int[] A04;
    public final TrackGroupArray[] A05;
    public final int[][][] A06;

    public GM(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
        this.A04 = iArr;
        this.A05 = trackGroupArrayArr;
        this.A06 = iArr3;
        this.A03 = iArr2;
        this.A02 = trackGroupArray;
        int length = iArr.length;
        this.A01 = length;
        this.A00 = length;
    }

    public final int A00() {
        return this.A01;
    }

    public final int A01(int i2) {
        return this.A04[i2];
    }

    public final TrackGroupArray A02(int i2) {
        return this.A05[i2];
    }
}
