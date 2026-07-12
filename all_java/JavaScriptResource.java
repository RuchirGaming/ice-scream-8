package com.monetization.ads.video.models.ad;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class JavaScriptResource implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23778c;

    final class a implements Parcelable.Creator<JavaScriptResource> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource createFromParcel(Parcel parcel) {
            return new JavaScriptResource(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource[] newArray(int i2) {
            return new JavaScriptResource[i2];
        }
    }

    /* synthetic */ JavaScriptResource(Parcel parcel, int i2) {
        this(parcel);
    }

    public final String c() {
        return this.f23776a;
    }

    public final String d() {
        return this.f23777b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaScriptResource.class != obj.getClass()) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (this.f23778c == javaScriptResource.f23778c && this.f23776a.equals(javaScriptResource.f23776a)) {
            return this.f23777b.equals(javaScriptResource.f23777b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23777b.hashCode() + (((this.f23776a.hashCode() * 31) + (this.f23778c ? 1 : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23776a);
        parcel.writeInt(this.f23778c ? 1 : 0);
        parcel.writeString(this.f23777b);
    }

    public JavaScriptResource(String str, String str2, boolean z) {
        this.f23776a = str;
        this.f23777b = str2;
        this.f23778c = z;
    }

    private JavaScriptResource(Parcel parcel) {
        this.f23776a = parcel.readString();
        this.f23778c = parcel.readInt() != 0;
        this.f23777b = parcel.readString();
    }
}
