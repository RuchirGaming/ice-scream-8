package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i2) {
            return new BatchReportMessage[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20400c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BatchReportMessage(String str, String str2, long j2) {
        this.f20398a = str;
        this.f20399b = str2;
        this.f20400c = j2;
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f20398a = parcel.readString();
        this.f20399b = parcel.readString();
        this.f20400c = parcel.readLong();
    }

    public String getUuid() {
        return this.f20398a;
    }

    public void setUuid(String str) {
        this.f20398a = str;
    }

    public String getReportMessage() {
        return this.f20399b;
    }

    public void setReportMessage(String str) {
        this.f20399b = str;
    }

    public long getTimestamp() {
        return this.f20400c;
    }

    public void setTimestamp(long j2) {
        this.f20400c = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20398a);
        parcel.writeString(this.f20399b);
        parcel.writeLong(this.f20400c);
    }
}
