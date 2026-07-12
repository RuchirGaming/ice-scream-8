package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class ClientSideReward implements Parcelable {
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23224b;

    final class a implements Parcelable.Creator<ClientSideReward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward createFromParcel(Parcel parcel) {
            return new ClientSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward[] newArray(int i2) {
            return new ClientSideReward[i2];
        }
    }

    public ClientSideReward(int i2, String str) {
        this.f23223a = i2;
        this.f23224b = str;
    }

    public final int c() {
        return this.f23223a;
    }

    public final String d() {
        return this.f23224b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23223a);
        parcel.writeString(this.f23224b);
    }

    protected ClientSideReward(Parcel parcel) {
        this.f23223a = parcel.readInt();
        this.f23224b = parcel.readString();
    }
}
