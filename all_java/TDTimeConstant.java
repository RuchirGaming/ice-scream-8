package cn.thinkinganalyticsclone.android.utils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDTimeConstant implements ITime {
    private final String mTimeString;
    private final Double mZoneOffset;

    public TDTimeConstant(String timeString, Double zoneOffset) {
        this.mTimeString = timeString;
        this.mZoneOffset = zoneOffset;
    }

    @Override // cn.thinkinganalyticsclone.android.utils.ITime
    public String getTime() {
        return this.mTimeString;
    }

    @Override // cn.thinkinganalyticsclone.android.utils.ITime
    public Double getZoneOffset() {
        return this.mZoneOffset;
    }
}
