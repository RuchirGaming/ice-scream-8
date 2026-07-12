package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class m4 {
    public static boolean a(AdPlaybackState adPlaybackState, int i2, int i3) {
        AdPlaybackState.AdGroup adGroup;
        int i4;
        return i2 < adPlaybackState.adGroupCount && (i4 = (adGroup = adPlaybackState.getAdGroup(i2)).count) != -1 && i3 < i4 && adGroup.states[i3] == 2;
    }
}
