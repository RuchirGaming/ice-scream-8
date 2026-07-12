package com.google.android.gms.auth;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    GooglePlayServicesAvailabilityException(int i2, String str, Intent intent) {
        super(str, intent);
        this.zza = i2;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
