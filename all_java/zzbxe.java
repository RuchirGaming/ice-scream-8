package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzbxe extends zzavg implements zzbxg {
    zzbxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final int zze() throws RemoteException {
        Parcel parcelZzbh = zzbh(2, zza());
        int i2 = parcelZzbh.readInt();
        parcelZzbh.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final String zzf() throws RemoteException {
        Parcel parcelZzbh = zzbh(1, zza());
        String string = parcelZzbh.readString();
        parcelZzbh.recycle();
        return string;
    }
}
