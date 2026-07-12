package cn.thinkinganalyticsclone.android.utils;

import android.os.SystemClock;
import java.util.Date;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class TDCalibratedTime implements ICalibratedTime {
    private final long mSystemElapsedRealtime = SystemClock.elapsedRealtime();
    private final long startTime;

    public TDCalibratedTime(long startTime) {
        this.startTime = startTime;
    }

    @Override // cn.thinkinganalyticsclone.android.utils.ICalibratedTime
    public Date get(long systemElapsedRealtime) {
        return new Date((systemElapsedRealtime - this.mSystemElapsedRealtime) + this.startTime);
    }
}
