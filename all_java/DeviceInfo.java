package io.bidmachine.models;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface DeviceInfo {
    String getHttpAgent(Context context);

    String getIfa(Context context);

    boolean isLimitAdTrackingEnabled();
}
