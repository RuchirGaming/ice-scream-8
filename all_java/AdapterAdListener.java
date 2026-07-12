package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i2, String str);

    void onAdLoadSuccess();

    void onAdOpened();
}
