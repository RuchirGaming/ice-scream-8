package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.ironsource.sdk.constants.a;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j2, long j3) {
        this.timeUs = j2;
        this.position = j3;
    }

    public final String toString() {
        return "[timeUs=" + this.timeUs + ", position=" + this.position + a.i.f17749e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeekPoint seekPoint = (SeekPoint) obj;
        return this.timeUs == seekPoint.timeUs && this.position == seekPoint.position;
    }

    public final int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }
}
