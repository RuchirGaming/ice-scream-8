package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface ICommonPermissionListener extends IInterface {

    public static class Default implements ICommonPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onDenied(String str) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onGranted() throws RemoteException {
        }
    }

    void onDenied(String str) throws RemoteException;

    void onGranted() throws RemoteException;

    public static abstract class Stub extends Binder implements ICommonPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        public static ICommonPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICommonPermissionListener)) {
                return (ICommonPermissionListener) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onGranted();
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 2) {
                if (i2 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    return true;
                }
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            onDenied(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        private static class a implements ICommonPermissionListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ICommonPermissionListener f4538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4539b;

            a(IBinder iBinder) {
                this.f4539b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4539b;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onGranted() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if (!this.f4539b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onGranted();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onDenied(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    parcelObtain.writeString(str);
                    if (!this.f4539b.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDenied(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonPermissionListener iCommonPermissionListener) {
            if (a.f4538a != null || iCommonPermissionListener == null) {
                return false;
            }
            a.f4538a = iCommonPermissionListener;
            return true;
        }

        public static ICommonPermissionListener getDefaultImpl() {
            return a.f4538a;
        }
    }
}
