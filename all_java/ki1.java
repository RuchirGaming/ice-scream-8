package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class ki1 {
    ki1() {
    }

    static AdPlaybackState a(AdPlaybackState adPlaybackState, long j2) {
        AdPlaybackState adPlaybackStateWithContentDurationUs = adPlaybackState.withContentDurationUs(j2);
        for (int i2 = 0; i2 < adPlaybackStateWithContentDurationUs.adGroupCount; i2++) {
            if (adPlaybackStateWithContentDurationUs.getAdGroup(i2).timeUs > j2) {
                adPlaybackStateWithContentDurationUs = adPlaybackStateWithContentDurationUs.withSkippedAdGroup(i2);
            }
        }
        return adPlaybackStateWithContentDurationUs;
    }
}
