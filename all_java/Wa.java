package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Wa implements Parcelable {
    public static final Parcelable.Creator<Wa> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26170b;

    class a implements Parcelable.Creator<Wa> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Wa createFromParcel(Parcel parcel) {
            return new Wa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Wa[] newArray(int i2) {
            return new Wa[i2];
        }
    }

    public Wa(long j2, int i2) {
        this.f26169a = j2;
        this.f26170b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfig{expirationTimestampSeconds=" + this.f26169a + ", intervalSeconds=" + this.f26170b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f26169a);
        parcel.writeInt(this.f26170b);
    }

    protected Wa(Parcel parcel) {
        this.f26169a = parcel.readLong();
        this.f26170b = parcel.readInt();
    }
}
