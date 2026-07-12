package com.monetization.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class FalseClick implements Parcelable {
    public static final Parcelable.Creator<FalseClick> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23233b;

    final class a implements Parcelable.Creator<FalseClick> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final FalseClick createFromParcel(Parcel parcel) {
            return new FalseClick(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FalseClick[] newArray(int i2) {
            return new FalseClick[i2];
        }
    }

    public FalseClick(String str, long j2) {
        this.f23232a = str;
        this.f23233b = j2;
    }

    public final long c() {
        return this.f23233b;
    }

    public final String d() {
        return this.f23232a;
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
        FalseClick falseClick = (FalseClick) obj;
        if (this.f23233b != falseClick.f23233b) {
            return false;
        }
        return this.f23232a.equals(falseClick.f23232a);
    }

    public final int hashCode() {
        int iHashCode = this.f23232a.hashCode() * 31;
        long j2 = this.f23233b;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23232a);
        parcel.writeLong(this.f23233b);
    }

    public FalseClick(Parcel parcel) {
        this.f23232a = parcel.readString();
        this.f23233b = parcel.readLong();
    }
}
