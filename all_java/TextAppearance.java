package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.jr0;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class TextAppearance implements Parcelable, jr0 {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37618d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f37621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37622d;

        public TextAppearance build() {
            return new TextAppearance(this, 0);
        }

        public Builder setFontFamilyName(String str) {
            this.f37619a = str;
            return this;
        }

        public Builder setFontStyle(int i2) {
            this.f37622d = i2;
            return this;
        }

        public Builder setTextColor(int i2) {
            this.f37620b = i2;
            return this;
        }

        public Builder setTextSize(float f2) {
            this.f37621c = f2;
            return this;
        }
    }

    final class a implements Parcelable.Creator<TextAppearance> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            return new TextAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i2) {
            return new TextAppearance[i2];
        }
    }

    /* synthetic */ TextAppearance(Builder builder, int i2) {
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
        if (obj == null || TextAppearance.class != obj.getClass()) {
            return false;
        }
        TextAppearance textAppearance = (TextAppearance) obj;
        if (this.f37616b != textAppearance.f37616b || Float.compare(textAppearance.f37617c, this.f37617c) != 0 || this.f37618d != textAppearance.f37618d) {
            return false;
        }
        String str = this.f37615a;
        if (str != null) {
            if (str.equals(textAppearance.f37615a)) {
                return true;
            }
        } else if (textAppearance.f37615a == null) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.jr0
    public String getFontFamilyName() {
        return this.f37615a;
    }

    @Override // com.yandex.mobile.ads.impl.jr0
    public int getFontStyle() {
        return this.f37618d;
    }

    @Override // com.yandex.mobile.ads.impl.jr0
    public int getTextColor() {
        return this.f37616b;
    }

    @Override // com.yandex.mobile.ads.impl.jr0
    public float getTextSize() {
        return this.f37617c;
    }

    public int hashCode() {
        int i2 = this.f37616b * 31;
        float f2 = this.f37617c;
        int iFloatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        String str = this.f37615a;
        return ((iFloatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f37618d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f37616b);
        parcel.writeFloat(this.f37617c);
        parcel.writeString(this.f37615a);
        parcel.writeInt(this.f37618d);
    }

    private TextAppearance(Builder builder) {
        this.f37616b = builder.f37620b;
        this.f37617c = builder.f37621c;
        this.f37615a = builder.f37619a;
        this.f37618d = builder.f37622d;
    }

    protected TextAppearance(Parcel parcel) {
        this.f37616b = parcel.readInt();
        this.f37617c = parcel.readFloat();
        this.f37615a = parcel.readString();
        this.f37618d = parcel.readInt();
    }
}
