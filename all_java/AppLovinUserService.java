package com.applovin.sdk;

import android.app.Activity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AppLovinUserService {

    public interface OnConsentDialogDismissListener {
        void onDismiss();
    }

    void preloadConsentDialog();

    void showConsentDialog(Activity activity, OnConsentDialogDismissListener onConsentDialogDismissListener);
}
