package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.hr0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class RatingAppearance implements Parcelable, hr0 {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37612b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37614b;

        public RatingAppearance build() {
            return new RatingAppearance(this, 0);
        }

        public Builder setBackgroundStarColor(int i2) {
            this.f37613a = i2;
            return this;
        }

        public Builder setProgressStarColor(int i2) {
            this.f37614b = i2;
            return this;
        }
    }

    final class a implements Parcelable.Creator<RatingAppearance> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            return new RatingAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i2) {
            return new RatingAppearance[i2];
        }
    }

    /* synthetic */ RatingAppearance(Builder builder, int i2) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RatingAppearance.class != obj.getClass()) {
            return false;
        }
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return this.f37611a == ratingAppearance.f37611a && this.f37612b == ratingAppearance.f37612b;
    }

    @Override // com.yandex.mobile.ads.impl.hr0
    public int getBackgroundStarColor() {
        return this.f37611a;
    }

    @Override // com.yandex.mobile.ads.impl.hr0
    public int getProgressStarColor() {
        return this.f37612b;
    }

    public int hashCode() {
        return (this.f37611a * 31) + this.f37612b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f37611a);
        parcel.writeInt(this.f37612b);
    }

    private RatingAppearance(Builder builder) {
        this.f37611a = builder.f37613a;
        this.f37612b = builder.f37614b;
    }

    protected RatingAppearance(Parcel parcel) {
        this.f37611a = parcel.readInt();
        this.f37612b = parcel.readInt();
    }
}
