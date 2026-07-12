package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Kl implements Parcelable {
    public static final Parcelable.Creator<Kl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f25211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f25212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f25213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f25214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<C1888em> f25216p;

    class a implements Parcelable.Creator<Kl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Kl createFromParcel(Parcel parcel) {
            return new Kl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Kl[] newArray(int i2) {
            return new Kl[i2];
        }
    }

    public Kl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, int i3, int i4, int i5, int i6, List<C1888em> list) {
        this.f25201a = z;
        this.f25202b = z2;
        this.f25203c = z3;
        this.f25204d = z4;
        this.f25205e = z5;
        this.f25206f = z6;
        this.f25207g = z7;
        this.f25208h = z8;
        this.f25209i = z9;
        this.f25210j = z10;
        this.f25211k = i2;
        this.f25212l = i3;
        this.f25213m = i4;
        this.f25214n = i5;
        this.f25215o = i6;
        this.f25216p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Kl.class != obj.getClass()) {
            return false;
        }
        Kl kl = (Kl) obj;
        if (this.f25201a == kl.f25201a && this.f25202b == kl.f25202b && this.f25203c == kl.f25203c && this.f25204d == kl.f25204d && this.f25205e == kl.f25205e && this.f25206f == kl.f25206f && this.f25207g == kl.f25207g && this.f25208h == kl.f25208h && this.f25209i == kl.f25209i && this.f25210j == kl.f25210j && this.f25211k == kl.f25211k && this.f25212l == kl.f25212l && this.f25213m == kl.f25213m && this.f25214n == kl.f25214n && this.f25215o == kl.f25215o) {
            return this.f25216p.equals(kl.f25216p);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.f25201a ? 1 : 0) * 31) + (this.f25202b ? 1 : 0)) * 31) + (this.f25203c ? 1 : 0)) * 31) + (this.f25204d ? 1 : 0)) * 31) + (this.f25205e ? 1 : 0)) * 31) + (this.f25206f ? 1 : 0)) * 31) + (this.f25207g ? 1 : 0)) * 31) + (this.f25208h ? 1 : 0)) * 31) + (this.f25209i ? 1 : 0)) * 31) + (this.f25210j ? 1 : 0)) * 31) + this.f25211k) * 31) + this.f25212l) * 31) + this.f25213m) * 31) + this.f25214n) * 31) + this.f25215o) * 31) + this.f25216p.hashCode();
    }

    public String toString() {
        return "UiCollectingConfig{textSizeCollecting=" + this.f25201a + ", relativeTextSizeCollecting=" + this.f25202b + ", textVisibilityCollecting=" + this.f25203c + ", textStyleCollecting=" + this.f25204d + ", infoCollecting=" + this.f25205e + ", nonContentViewCollecting=" + this.f25206f + ", textLengthCollecting=" + this.f25207g + ", viewHierarchical=" + this.f25208h + ", ignoreFiltered=" + this.f25209i + ", webViewUrlsCollecting=" + this.f25210j + ", tooLongTextBound=" + this.f25211k + ", truncatedTextBound=" + this.f25212l + ", maxEntitiesCount=" + this.f25213m + ", maxFullContentLength=" + this.f25214n + ", webViewUrlLimit=" + this.f25215o + ", filters=" + this.f25216p + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f25201a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25202b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25203c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25204d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25205e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25206f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25207g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25208h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25209i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25210j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25211k);
        parcel.writeInt(this.f25212l);
        parcel.writeInt(this.f25213m);
        parcel.writeInt(this.f25214n);
        parcel.writeInt(this.f25215o);
        parcel.writeList(this.f25216p);
    }

    protected Kl(Parcel parcel) {
        this.f25201a = parcel.readByte() != 0;
        this.f25202b = parcel.readByte() != 0;
        this.f25203c = parcel.readByte() != 0;
        this.f25204d = parcel.readByte() != 0;
        this.f25205e = parcel.readByte() != 0;
        this.f25206f = parcel.readByte() != 0;
        this.f25207g = parcel.readByte() != 0;
        this.f25208h = parcel.readByte() != 0;
        this.f25209i = parcel.readByte() != 0;
        this.f25210j = parcel.readByte() != 0;
        this.f25211k = parcel.readInt();
        this.f25212l = parcel.readInt();
        this.f25213m = parcel.readInt();
        this.f25214n = parcel.readInt();
        this.f25215o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C1888em.class.getClassLoader());
        this.f25216p = arrayList;
    }
}
