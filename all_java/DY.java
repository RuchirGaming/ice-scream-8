package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class DY {
    public final int A00;
    public final long A01;
    public final long A02;

    public DY(int i2, long j2, long j3) {
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    public /* synthetic */ DY(int i2, long j2, long j3, DX dx) {
        this(i2, j2, j3);
    }

    public static DY A00(Parcel parcel) {
        return new DY(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
