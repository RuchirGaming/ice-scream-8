package com.applovin.sdk;

import android.app.Activity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AppLovinCmpService {

    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(Activity activity, OnCompletedListener onCompletedListener);
}
