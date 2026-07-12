package com.digitalturbine.ignite.cl.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface IIgniteServiceCallback extends IInterface {
    void onError(String str) throws RemoteException;

    void onProgress(String str) throws RemoteException;

    void onScheduled(String str) throws RemoteException;

    void onStart(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IIgniteServiceCallback {
        public Stub() {
            attachInterface(this, "com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            }
            if (i2 == 1598968902) {
                parcel2.writeString("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
                return true;
            }
            if (i2 == 1) {
                onScheduled(parcel.readString());
                parcel2.writeNoException();
            } else if (i2 == 2) {
                onStart(parcel.readString());
                parcel2.writeNoException();
            } else if (i2 == 3) {
                onProgress(parcel.readString());
                parcel2.writeNoException();
            } else if (i2 == 4) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i2 != 5) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                onError(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }
}
