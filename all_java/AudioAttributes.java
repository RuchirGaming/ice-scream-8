package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new Builder().build();
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;

        public final Builder setContentType(int i2) {
            this.contentType = i2;
            return this;
        }

        public final Builder setFlags(int i2) {
            this.flags = i2;
            return this;
        }

        public final Builder setUsage(int i2) {
            this.usage = i2;
            return this;
        }

        public final AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage);
        }
    }

    private AudioAttributes(int i2, int i3, int i4) {
        this.contentType = i2;
        this.flags = i3;
        this.usage = i4;
    }

    final android.media.AudioAttributes getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage).build();
        }
        return this.audioAttributesV21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.contentType) * 31) + this.flags) * 31) + this.usage;
    }
}
