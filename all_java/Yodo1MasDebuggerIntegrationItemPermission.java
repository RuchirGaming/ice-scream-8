package com.yodo1.mas.debugger.integration.items;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasDebuggerIntegrationItemPermission implements Parcelable {
    public static final Parcelable.Creator<Yodo1MasDebuggerIntegrationItemPermission> CREATOR = new Parcelable.Creator<Yodo1MasDebuggerIntegrationItemPermission>() { // from class: com.yodo1.mas.debugger.integration.items.Yodo1MasDebuggerIntegrationItemPermission.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Yodo1MasDebuggerIntegrationItemPermission createFromParcel(Parcel in) {
            return new Yodo1MasDebuggerIntegrationItemPermission(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Yodo1MasDebuggerIntegrationItemPermission[] newArray(int size) {
            return new Yodo1MasDebuggerIntegrationItemPermission[size];
        }
    };
    public boolean isCheck;
    public String name;
    public String permission;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.name);
        parcel.writeString(this.permission);
        parcel.writeInt(this.isCheck ? 1 : 0);
    }

    protected Yodo1MasDebuggerIntegrationItemPermission(Parcel in) {
        this.name = in.readString();
        this.permission = in.readString();
        this.isCheck = in.readInt() == 1;
    }

    public Yodo1MasDebuggerIntegrationItemPermission(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }
}
