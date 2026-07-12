package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1917g1 implements Parcelable {
    public static final Parcelable.Creator<C1917g1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1867e1 f26934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26935c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g1$a */
    class a implements Parcelable.Creator<C1917g1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public C1917g1 createFromParcel(Parcel parcel) {
            return new C1917g1(parcel.readString(), EnumC1867e1.a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C1917g1[] newArray(int i2) {
            return new C1917g1[i2];
        }
    }

    public C1917g1(String str, EnumC1867e1 enumC1867e1, String str2) {
        this.f26933a = str;
        this.f26934b = enumC1867e1;
        this.f26935c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1917g1.class != obj.getClass()) {
            return false;
        }
        C1917g1 c1917g1 = (C1917g1) obj;
        String str = this.f26933a;
        if (str == null ? c1917g1.f26933a != null : !str.equals(c1917g1.f26933a)) {
            return false;
        }
        if (this.f26934b != c1917g1.f26934b) {
            return false;
        }
        String str2 = this.f26935c;
        if (str2 != null) {
            return str2.equals(c1917g1.f26935c);
        }
        return c1917g1.f26935c == null;
    }

    public int hashCode() {
        String str = this.f26933a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f26934b.hashCode()) * 31;
        String str2 = this.f26935c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IdentifiersResultInternal{mId='" + this.f26933a + "', mStatus=" + this.f26934b + ", mErrorExplanation='" + this.f26935c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26933a);
        parcel.writeString(this.f26934b.a());
        parcel.writeString(this.f26935c);
    }
}
