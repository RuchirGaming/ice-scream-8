package com.google.android.ump;

import android.app.Activity;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface ConsentForm {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener);
}
