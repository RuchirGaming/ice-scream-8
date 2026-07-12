package com.mbridge.msdk.foundation.download;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new Parcelable.Creator<DownloadProgress>() { // from class: com.mbridge.msdk.foundation.download.DownloadProgress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadProgress[] newArray(int i2) {
            return new DownloadProgress[i2];
        }
    };
    private long current;
    private int currentDownloadRate;
    private long total;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DownloadProgress(long j2, long j3, int i2) {
        this.current = j2;
        this.total = j3;
        this.currentDownloadRate = i2;
    }

    public long getCurrent() {
        return this.current;
    }

    public long getTotal() {
        return this.total;
    }

    public int getCurrentDownloadRate() {
        return this.currentDownloadRate;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.current);
        parcel.writeLong(this.total);
        parcel.writeInt(this.currentDownloadRate);
    }

    protected DownloadProgress(Parcel parcel) {
        this.current = parcel.readLong();
        this.total = parcel.readLong();
        this.currentDownloadRate = parcel.readInt();
    }
}
