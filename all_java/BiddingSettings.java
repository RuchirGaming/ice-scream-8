package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class BiddingSettings implements Parcelable {
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AdUnitIdBiddingSettings> f23220a;

    final class a implements Parcelable.Creator<BiddingSettings> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings createFromParcel(Parcel parcel) {
            return new BiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings[] newArray(int i2) {
            return new BiddingSettings[i2];
        }
    }

    public BiddingSettings(ArrayList arrayList) {
        this.f23220a = arrayList;
    }

    public final List<AdUnitIdBiddingSettings> c() {
        return this.f23220a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f23220a.equals(((BiddingSettings) obj).f23220a);
    }

    public final int hashCode() {
        return this.f23220a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f23220a);
    }

    protected BiddingSettings(Parcel parcel) {
        this.f23220a = parcel.createTypedArrayList(AdUnitIdBiddingSettings.CREATOR);
    }
}
