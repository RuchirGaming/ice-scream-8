package com.monetization.ads.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class AdImpressionData implements Parcelable {
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23234a;

    final class a implements Parcelable.Creator<AdImpressionData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData createFromParcel(Parcel parcel) {
            return new AdImpressionData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData[] newArray(int i2) {
            return new AdImpressionData[i2];
        }
    }

    public AdImpressionData(String str) {
        this.f23234a = str;
    }

    public final String c() {
        return this.f23234a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f23234a.equals(((AdImpressionData) obj).f23234a);
    }

    public final int hashCode() {
        return this.f23234a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23234a);
    }

    protected AdImpressionData(Parcel parcel) {
        this.f23234a = parcel.readString();
    }
}
