package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class ServerSideReward implements Parcelable {
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23231a;

    final class a implements Parcelable.Creator<ServerSideReward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward createFromParcel(Parcel parcel) {
            return new ServerSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward[] newArray(int i2) {
            return new ServerSideReward[i2];
        }
    }

    public ServerSideReward(String str) {
        this.f23231a = str;
    }

    public final String c() {
        return this.f23231a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23231a);
    }

    protected ServerSideReward(Parcel parcel) {
        this.f23231a = parcel.readString();
    }
}
