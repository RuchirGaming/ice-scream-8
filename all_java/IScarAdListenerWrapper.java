package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IScarAdListenerWrapper {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i2, String str);

    void onAdLoaded();

    void onAdOpened();
}
