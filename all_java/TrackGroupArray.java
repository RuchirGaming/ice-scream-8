package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.F3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class TrackGroupArray implements Parcelable {
    public static String[] A03 = {"CPEwG9kX5jD", "BuT4NFhECA4LIoxcibTyV2rTxW8D7NsJ", "VLvhUNyYrf820yvuRBkPHRPWgKLlpjnS", "oxeVMxvuq0fQP8O4UP99i7KUs83wljn7", "ullnJTMWkmSfBc1cpn0n9HDTgALaYzbW", "uWsPmZUlFuxS4B4B7078xNnndmjfetpu", "kBzYEJnvMy4hYPMlsmjxFp4F3Gjj42", "O4Dh4XK1VBS6gYYO8yxgdHKR7TJnBRof"};
    public static final TrackGroupArray A04 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new F3();
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    public TrackGroupArray(Parcel parcel) {
        int i2 = parcel.readInt();
        this.A01 = i2;
        this.A02 = new TrackGroup[i2];
        for (int i3 = 0; i3 < i; i3++) {
            this.A02[i3] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    public final int A00(TrackGroup trackGroup) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A02[i2] == trackGroup) {
                return i2;
            }
        }
        if (A03[6].length() != 30) {
            throw new RuntimeException();
        }
        A03[0] = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        return -1;
    }

    public final TrackGroup A01(int i2) {
        return this.A02[i2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.A01 == trackGroupArray.A01 && Arrays.equals(this.A02, trackGroupArray.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        for (int i3 = 0; i3 < i; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }
}
