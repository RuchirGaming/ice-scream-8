package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0898Db {
    public final int A00;
    public final long A01;

    public C0898Db(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public /* synthetic */ C0898Db(int i2, long j2, C0897Da c0897Da) {
        this(i2, j2);
    }

    public static C0898Db A00(Parcel parcel) {
        return new C0898Db(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
