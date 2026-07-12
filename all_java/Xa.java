package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wa f26269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wa f26270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wa f26271c;

    class a implements Parcelable.Creator<Xa> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Xa createFromParcel(Parcel parcel) {
            return new Xa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Xa[] newArray(int i2) {
            return new Xa[i2];
        }
    }

    public Xa() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f26269a + ", clidsInfoConfig=" + this.f26270b + ", preloadInfoConfig=" + this.f26271c + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f26269a, i2);
        parcel.writeParcelable(this.f26270b, i2);
        parcel.writeParcelable(this.f26271c, i2);
    }

    public Xa(Wa wa, Wa wa2, Wa wa3) {
        this.f26269a = wa;
        this.f26270b = wa2;
        this.f26271c = wa3;
    }

    protected Xa(Parcel parcel) {
        this.f26269a = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.f26270b = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.f26271c = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
    }
}
