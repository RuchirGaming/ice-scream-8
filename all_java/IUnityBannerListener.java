package com.unity3d.services.banners;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface IUnityBannerListener {
    void onUnityBannerClick(String str);

    void onUnityBannerError(String str);

    void onUnityBannerHide(String str);

    void onUnityBannerLoaded(String str, View view);

    void onUnityBannerShow(String str);

    void onUnityBannerUnloaded(String str);
}
