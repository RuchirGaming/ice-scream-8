package com.monetization.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.oi0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MediationData implements Parcelable {
    public static final Parcelable.Creator<MediationData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<oi0> f23221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f23222b;

    final class a implements Parcelable.Creator<MediationData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData createFromParcel(Parcel parcel) {
            return new MediationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData[] newArray(int i2) {
            return new MediationData[i2];
        }
    }

    public MediationData(ArrayList arrayList, HashMap map) {
        this.f23221a = arrayList;
        this.f23222b = map;
    }

    public final List<oi0> c() {
        return this.f23221a;
    }

    public final Map<String, String> d() {
        return this.f23222b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f23221a);
        parcel.writeInt(this.f23222b.size());
        for (Map.Entry<String, String> entry : this.f23222b.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    protected MediationData(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f23221a = arrayList;
        parcel.readList(arrayList, oi0.class.getClassLoader());
        int i2 = parcel.readInt();
        this.f23222b = new HashMap(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f23222b.put(parcel.readString(), parcel.readString());
        }
    }
}
