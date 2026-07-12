package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
