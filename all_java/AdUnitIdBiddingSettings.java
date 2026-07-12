package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.oi0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class AdUnitIdBiddingSettings implements Parcelable {
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<oi0> f23218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23219c;

    final class a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings createFromParcel(Parcel parcel) {
            return new AdUnitIdBiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings[] newArray(int i2) {
            return new AdUnitIdBiddingSettings[i2];
        }
    }

    public AdUnitIdBiddingSettings(String str, String str2, ArrayList arrayList) {
        this.f23217a = str;
        this.f23218b = arrayList;
        this.f23219c = str2;
    }

    public final String c() {
        return this.f23217a;
    }

    public final List<oi0> d() {
        return this.f23218b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f23219c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        return this.f23217a.equals(adUnitIdBiddingSettings.f23217a) && this.f23218b.equals(adUnitIdBiddingSettings.f23218b);
    }

    public final int hashCode() {
        return this.f23218b.hashCode() + (this.f23217a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f23218b);
        parcel.writeString(this.f23217a);
        parcel.writeString(this.f23219c);
    }

    protected AdUnitIdBiddingSettings(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f23218b = arrayList;
        parcel.readList(arrayList, oi0.class.getClassLoader());
        this.f23217a = parcel.readString();
        this.f23219c = parcel.readString();
    }
}
