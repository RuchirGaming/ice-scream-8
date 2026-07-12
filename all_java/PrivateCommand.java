package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C1002Hh;
import com.facebook.ads.redexgen.X.DW;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new DW();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.A01 = j3;
        this.A00 = j2;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, DW dw) {
        this(parcel);
    }

    public static PrivateCommand A00(C1002Hh c1002Hh, int i2, long j2) {
        long jA0M = c1002Hh.A0M();
        byte[] bArr = new byte[i2 - 4];
        c1002Hh.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(jA0M, bArr, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
