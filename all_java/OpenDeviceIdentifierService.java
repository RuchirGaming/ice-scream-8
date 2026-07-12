package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
interface OpenDeviceIdentifierService extends IInterface {
    String getOaid() throws RemoteException;

    boolean isOaidTrackLimited() throws RemoteException;

    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        private static class Proxy implements OpenDeviceIdentifierService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f23243a;

            Proxy(IBinder iBinder) {
                this.f23243a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23243a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f23243a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean isOaidTrackLimited() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f23243a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        public static OpenDeviceIdentifierService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OpenDeviceIdentifierService)) ? new Proxy(iBinder) : (OpenDeviceIdentifierService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                parcel2.writeNoException();
                parcel2.writeString(oaid);
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return true;
            }
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean zIsOaidTrackLimited = isOaidTrackLimited();
            parcel2.writeNoException();
            parcel2.writeInt(zIsOaidTrackLimited ? 1 : 0);
            return true;
        }
    }
}
