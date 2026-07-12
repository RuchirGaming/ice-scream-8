package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface Subtitle {
    List<Cue> getCues(long j2);

    long getEventTime(int i2);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j2);
}
