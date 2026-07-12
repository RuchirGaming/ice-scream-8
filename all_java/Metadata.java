package com.mbridge.msdk.playercommon.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i2) {
            return new Metadata[0];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }
    };
    private final Entry[] entries;

    public interface Entry extends Parcelable {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Metadata(Entry... entryArr) {
        this.entries = entryArr == null ? new Entry[0] : entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.entries = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.entries = new Entry[0];
    }

    Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i2 >= entryArr.length) {
                return;
            }
            entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i2++;
        }
    }

    public final int length() {
        return this.entries.length;
    }

    public final Entry get(int i2) {
        return this.entries[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.entries, ((Metadata) obj).entries);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.entries);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.entries.length);
        for (Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
