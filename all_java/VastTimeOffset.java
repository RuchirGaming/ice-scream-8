package com.monetization.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class VastTimeOffset implements Parcelable {
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23780b;

    final class a implements Parcelable.Creator<VastTimeOffset> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset createFromParcel(Parcel parcel) {
            return new VastTimeOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset[] newArray(int i2) {
            return new VastTimeOffset[i2];
        }
    }

    public enum b {
        f23781a,
        f23782b,
        f23783c;

        b() {
        }
    }

    public VastTimeOffset(b bVar, float f2) {
        this.f23779a = bVar;
        this.f23780b = f2;
    }

    public final b c() {
        return this.f23779a;
    }

    public final float d() {
        return this.f23780b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        b bVar = this.f23779a;
        parcel.writeInt(bVar == null ? -1 : bVar.ordinal());
        parcel.writeFloat(this.f23780b);
    }

    protected VastTimeOffset(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f23779a = i2 == -1 ? null : b.values()[i2];
        this.f23780b = parcel.readFloat();
    }
}
