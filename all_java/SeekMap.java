package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.ironsource.sdk.constants.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface SeekMap {
    long getDurationUs();

    SeekPoints getSeekPoints(long j2);

    boolean isSeekable();

    public static final class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final boolean isSeekable() {
            return false;
        }

        public Unseekable(long j2) {
            this(j2, 0L);
        }

        public Unseekable(long j2, long j3) {
            this.durationUs = j2;
            this.startSeekPoints = new SeekPoints(j3 == 0 ? SeekPoint.START : new SeekPoint(0L, j3));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public final SeekPoints getSeekPoints(long j2) {
            return this.startSeekPoints;
        }
    }

    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(a.i.f17748d);
            sb.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            sb.append(str);
            sb.append(a.i.f17749e);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SeekPoints seekPoints = (SeekPoints) obj;
            return this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second);
        }

        public final int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }
    }
}
