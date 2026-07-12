package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ir0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class SizeConstraint implements Parcelable, ir0 {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SizeConstraintType f37549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37550b;

    public enum SizeConstraintType implements ir0.a {
        FIXED(1),
        FIXED_RATIO(2),
        PREFERRED_RATIO(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f37552a;

        SizeConstraintType(int i2) {
            this.f37552a = i2;
        }

        public final int a() {
            return this.f37552a;
        }
    }

    final class a implements Parcelable.Creator<SizeConstraint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            return new SizeConstraint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i2) {
            return new SizeConstraint[i2];
        }
    }

    public SizeConstraint(SizeConstraintType sizeConstraintType, float f2) {
        this.f37549a = sizeConstraintType;
        this.f37550b = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SizeConstraint.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return Float.compare(sizeConstraint.f37550b, this.f37550b) == 0 && this.f37549a == sizeConstraint.f37549a;
    }

    @Override // com.yandex.mobile.ads.impl.ir0
    public float getValue() {
        return this.f37550b;
    }

    public int hashCode() {
        float f2 = this.f37550b;
        int iFloatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        SizeConstraintType sizeConstraintType = this.f37549a;
        return iFloatToIntBits + (sizeConstraintType != null ? sizeConstraintType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f37550b);
        SizeConstraintType sizeConstraintType = this.f37549a;
        parcel.writeInt(sizeConstraintType == null ? -1 : sizeConstraintType.ordinal());
    }

    @Override // com.yandex.mobile.ads.impl.ir0
    public SizeConstraintType getSizeConstraintType() {
        return this.f37549a;
    }

    protected SizeConstraint(Parcel parcel) {
        this.f37550b = parcel.readFloat();
        int i2 = parcel.readInt();
        this.f37549a = i2 == -1 ? null : SizeConstraintType.values()[i2];
    }
}
