package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1813bm implements Parcelable {
    public static final Parcelable.Creator<C1813bm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<C1888em> f26632h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bm$a */
    class a implements Parcelable.Creator<C1813bm> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public C1813bm createFromParcel(Parcel parcel) {
            return new C1813bm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1813bm[] newArray(int i2) {
            return new C1813bm[i2];
        }
    }

    public C1813bm(int i2, int i3, int i4, long j2, boolean z, boolean z2, boolean z3, List<C1888em> list) {
        this.f26625a = i2;
        this.f26626b = i3;
        this.f26627c = i4;
        this.f26628d = j2;
        this.f26629e = z;
        this.f26630f = z2;
        this.f26631g = z3;
        this.f26632h = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1813bm.class != obj.getClass()) {
            return false;
        }
        C1813bm c1813bm = (C1813bm) obj;
        if (this.f26625a == c1813bm.f26625a && this.f26626b == c1813bm.f26626b && this.f26627c == c1813bm.f26627c && this.f26628d == c1813bm.f26628d && this.f26629e == c1813bm.f26629e && this.f26630f == c1813bm.f26630f && this.f26631g == c1813bm.f26631g) {
            return this.f26632h.equals(c1813bm.f26632h);
        }
        return false;
    }

    public int hashCode() {
        int i2 = ((((this.f26625a * 31) + this.f26626b) * 31) + this.f26627c) * 31;
        long j2 = this.f26628d;
        return ((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f26629e ? 1 : 0)) * 31) + (this.f26630f ? 1 : 0)) * 31) + (this.f26631g ? 1 : 0)) * 31) + this.f26632h.hashCode();
    }

    public String toString() {
        return "UiParsingConfig{tooLongTextBound=" + this.f26625a + ", truncatedTextBound=" + this.f26626b + ", maxVisitedChildrenInLevel=" + this.f26627c + ", afterCreateTimeout=" + this.f26628d + ", relativeTextSizeCalculation=" + this.f26629e + ", errorReporting=" + this.f26630f + ", parsingAllowedByDefault=" + this.f26631g + ", filters=" + this.f26632h + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f26625a);
        parcel.writeInt(this.f26626b);
        parcel.writeInt(this.f26627c);
        parcel.writeLong(this.f26628d);
        parcel.writeByte(this.f26629e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f26630f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f26631g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f26632h);
    }

    protected C1813bm(Parcel parcel) {
        this.f26625a = parcel.readInt();
        this.f26626b = parcel.readInt();
        this.f26627c = parcel.readInt();
        this.f26628d = parcel.readLong();
        this.f26629e = parcel.readByte() != 0;
        this.f26630f = parcel.readByte() != 0;
        this.f26631g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C1888em.class.getClassLoader());
        this.f26632h = arrayList;
    }
}
