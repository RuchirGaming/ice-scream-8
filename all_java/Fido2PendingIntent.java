package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.IntentSender;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
@Deprecated
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i2) throws IntentSender.SendIntentException;
}
