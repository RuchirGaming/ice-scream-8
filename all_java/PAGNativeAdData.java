package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface PAGNativeAdData {

    public enum PAGNativeMediaType {
        PAGNativeMediaTypeImage,
        PAGNativeMediaTypeVideo
    }

    View getAdChoicesView();

    View getAdLogoView();

    String getButtonText();

    String getDescription();

    PAGImageItem getIcon();

    PAGNativeMediaType getMediaType();

    PAGMediaView getMediaView();

    String getTitle();
}
