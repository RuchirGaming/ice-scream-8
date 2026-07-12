package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class UptimeClock implements Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }
}
