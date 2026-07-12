package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.fr0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class HorizontalOffset implements Parcelable, fr0 {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37548b;

    final class a implements Parcelable.Creator<HorizontalOffset> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            return new HorizontalOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i2) {
            return new HorizontalOffset[i2];
        }
    }

    public HorizontalOffset(float f2, float f3) {
        this.f37547a = f2;
        this.f37548b = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalOffset.class != obj.getClass()) {
            return false;
        }
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return Float.compare(horizontalOffset.f37547a, this.f37547a) == 0 && Float.compare(horizontalOffset.f37548b, this.f37548b) == 0;
    }

    @Override // com.yandex.mobile.ads.impl.fr0
    public float getLeft() {
        return this.f37547a;
    }

    @Override // com.yandex.mobile.ads.impl.fr0
    public float getRight() {
        return this.f37548b;
    }

    public int hashCode() {
        float f2 = this.f37547a;
        int iFloatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f37548b;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public String toString() {
        return this.f37547a + ", " + this.f37548b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f37547a);
        parcel.writeFloat(this.f37548b);
    }

    protected HorizontalOffset(Parcel parcel) {
        this.f37547a = parcel.readFloat();
        this.f37548b = parcel.readFloat();
    }
}
