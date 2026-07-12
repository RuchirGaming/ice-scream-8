package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface IBinderPool extends IInterface {

    public static class Default implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i2) throws RemoteException {
            return null;
        }
    }

    IBinder queryBinder(int i2) throws RemoteException;

    public static abstract class Stub extends Binder implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IBinderPool)) {
                return (IBinderPool) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 1) {
                if (i2 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                    return true;
                }
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            IBinder iBinderQueryBinder = queryBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinderQueryBinder);
            return true;
        }

        private static class a implements IBinderPool {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static IBinderPool f4534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4535b;

            a(IBinder iBinder) {
                this.f4535b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4535b;
            }

            @Override // com.bytedance.sdk.openadsdk.IBinderPool
            public IBinder queryBinder(int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    parcelObtain.writeInt(i2);
                    if (!this.f4535b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(i2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool) {
            if (a.f4534a != null || iBinderPool == null) {
                return false;
            }
            a.f4534a = iBinderPool;
            return true;
        }

        public static IBinderPool getDefaultImpl() {
            return a.f4534a;
        }
    }
}
