package com.monetization.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class RewardData implements Parcelable {
    public static final Parcelable.Creator<RewardData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClientSideReward f23226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ServerSideReward f23227c;

    final class a implements Parcelable.Creator<RewardData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData createFromParcel(Parcel parcel) {
            return new RewardData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData[] newArray(int i2) {
            return new RewardData[i2];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ClientSideReward f23229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ServerSideReward f23230c;

        public final RewardData a() {
            return new RewardData(this, 0);
        }

        public final b a(boolean z) {
            this.f23228a = z;
            return this;
        }

        public final b a(ClientSideReward clientSideReward) {
            this.f23229b = clientSideReward;
            return this;
        }

        public final b a(ServerSideReward serverSideReward) {
            this.f23230c = serverSideReward;
            return this;
        }
    }

    /* synthetic */ RewardData(b bVar, int i2) {
        this(bVar);
    }

    public final ClientSideReward c() {
        return this.f23226b;
    }

    public final ServerSideReward d() {
        return this.f23227c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f23225a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f23225a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f23226b, i2);
        parcel.writeParcelable(this.f23227c, i2);
    }

    private RewardData(b bVar) {
        this.f23226b = bVar.f23229b;
        this.f23227c = bVar.f23230c;
        this.f23225a = bVar.f23228a;
    }

    protected RewardData(Parcel parcel) {
        this.f23225a = parcel.readByte() != 0;
        this.f23226b = (ClientSideReward) parcel.readParcelable(ClientSideReward.class.getClassLoader());
        this.f23227c = (ServerSideReward) parcel.readParcelable(ServerSideReward.class.getClassLoader());
    }
}
