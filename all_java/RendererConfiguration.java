package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0);
    public final int tunnelingAudioSessionId;

    public RendererConfiguration(int i2) {
        this.tunnelingAudioSessionId = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.tunnelingAudioSessionId == ((RendererConfiguration) obj).tunnelingAudioSessionId;
    }

    public final int hashCode() {
        return this.tunnelingAudioSessionId;
    }
}
