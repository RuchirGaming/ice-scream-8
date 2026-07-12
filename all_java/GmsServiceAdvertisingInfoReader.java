package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.ga0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class GmsServiceAdvertisingInfoReader implements a, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f23235a;

    GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.f23235a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23235a;
    }

    @Override // com.monetization.ads.core.identifiers.ad.gms.service.a
    public Boolean readAdTrackingLimited() {
        Boolean boolValueOf;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                parcelObtain.writeInt(1);
                this.f23235a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            int i2 = ga0.f30971a;
            boolValueOf = null;
        }
        return boolValueOf;
    }

    @Override // com.monetization.ads.core.identifiers.ad.gms.service.a
    public String readAdvertisingId() {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f23235a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            int i2 = ga0.f30971a;
            string = null;
        }
        return string;
    }
}
