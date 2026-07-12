package io.bidmachine.nativead.view;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class NativeAdContainerBridge {
    public static void configureContainer(NativeAdContainer nativeAdContainer, ViewGroup viewGroup) {
        nativeAdContainer.configureContainer(viewGroup);
    }

    public static void deConfigureContainer(NativeAdContainer nativeAdContainer) {
        nativeAdContainer.deConfigureContainer();
    }
}
