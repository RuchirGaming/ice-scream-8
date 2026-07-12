package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface BandwidthMeter {

    public interface EventListener {
        void onBandwidthSample(int i2, long j2, long j3);
    }

    long getBitrateEstimate();
}
