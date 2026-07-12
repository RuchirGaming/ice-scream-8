package com.monetization.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class AdBreakParameters implements Parcelable {
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23791c;

    final class a implements Parcelable.Creator<AdBreakParameters> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters createFromParcel(Parcel parcel) {
            return new AdBreakParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters[] newArray(int i2) {
            return new AdBreakParameters[i2];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23794c;

        public final void a(String str) {
            this.f23793b = str;
        }

        public final void b(String str) {
            this.f23792a = str;
        }

        public final void c(String str) {
            this.f23794c = str;
        }
    }

    /* synthetic */ AdBreakParameters(b bVar, int i2) {
        this(bVar);
    }

    public final String c() {
        return this.f23790b;
    }

    public final String d() {
        return this.f23789a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f23791c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23789a);
        parcel.writeString(this.f23790b);
        parcel.writeString(this.f23791c);
    }

    private AdBreakParameters(b bVar) {
        this.f23789a = bVar.f23792a;
        this.f23790b = bVar.f23793b;
        this.f23791c = bVar.f23794c;
    }

    protected AdBreakParameters(Parcel parcel) {
        this.f23789a = parcel.readString();
        this.f23790b = parcel.readString();
        this.f23791c = parcel.readString();
    }
}
