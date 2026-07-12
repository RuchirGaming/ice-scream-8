package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1888em implements Parcelable {
    public static final Parcelable.Creator<C1888em> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26852b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em$a */
    class a implements Parcelable.Creator<C1888em> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public C1888em createFromParcel(Parcel parcel) {
            return new C1888em(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1888em[] newArray(int i2) {
            return new C1888em[i2];
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26858a;

        b(int i2) {
            this.f26858a = i2;
        }

        public static b a(int i2) {
            b[] bVarArrValues = values();
            for (int i3 = 0; i3 < 4; i3++) {
                b bVar = bVarArrValues[i3];
                if (bVar.f26858a == i2) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C1888em(b bVar, String str) {
        this.f26851a = bVar;
        this.f26852b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1888em.class != obj.getClass()) {
            return false;
        }
        C1888em c1888em = (C1888em) obj;
        if (this.f26851a != c1888em.f26851a) {
            return false;
        }
        return this.f26852b.equals(c1888em.f26852b);
    }

    public int hashCode() {
        return (this.f26851a.hashCode() * 31) + this.f26852b.hashCode();
    }

    public String toString() {
        return "UiParsingFilter{type=" + this.f26851a + ", value='" + this.f26852b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f26851a.f26858a);
        parcel.writeString(this.f26852b);
    }

    protected C1888em(Parcel parcel) {
        this.f26851a = b.a(parcel.readInt());
        this.f26852b = (String) C2391ym.a(parcel.readString(), "");
    }
}
