package com.monetization.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23609c;

    final class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i2) {
            return new StreamKey[i2];
        }
    }

    public StreamKey(int i2, int i3, int i4) {
        this.f23607a = i2;
        this.f23608b = i3;
        this.f23609c = i4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i2 = this.f23607a - streamKey2.f23607a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f23608b - streamKey2.f23608b;
        return i3 == 0 ? this.f23609c - streamKey2.f23609c : i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f23607a == streamKey.f23607a && this.f23608b == streamKey.f23608b && this.f23609c == streamKey.f23609c;
    }

    public final int hashCode() {
        return (((this.f23607a * 31) + this.f23608b) * 31) + this.f23609c;
    }

    public final String toString() {
        return this.f23607a + "." + this.f23608b + "." + this.f23609c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23607a);
        parcel.writeInt(this.f23608b);
        parcel.writeInt(this.f23609c);
    }

    StreamKey(Parcel parcel) {
        this.f23607a = parcel.readInt();
        this.f23608b = parcel.readInt();
        this.f23609c = parcel.readInt();
    }
}
