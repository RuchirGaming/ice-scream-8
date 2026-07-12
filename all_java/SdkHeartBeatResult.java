package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public abstract long getMillis();

    public abstract String getSdkName();

    public static SdkHeartBeatResult create(String str, long j2) {
        return new AutoValue_SdkHeartBeatResult(str, j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return getMillis() < sdkHeartBeatResult.getMillis() ? -1 : 1;
    }
}
