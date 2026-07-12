package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface ICommonDialogListener extends IInterface {

    public static class Default implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws RemoteException {
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;

    public static abstract class Stub extends Binder implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static ICommonDialogListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICommonDialogListener)) {
                return (ICommonDialogListener) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnYes();
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 3) {
                if (i2 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    return true;
                }
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            onDialogCancel();
            parcel2.writeNoException();
            return true;
        }

        private static class a implements ICommonDialogListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ICommonDialogListener f4536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4537b;

            a(IBinder iBinder) {
                this.f4537b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4537b;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.f4537b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnYes();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.f4537b.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnNo();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.f4537b.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogCancel();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener) {
            if (a.f4536a != null || iCommonDialogListener == null) {
                return false;
            }
            a.f4536a = iCommonDialogListener;
            return true;
        }

        public static ICommonDialogListener getDefaultImpl() {
            return a.f4536a;
        }
    }
}
