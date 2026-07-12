package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();
}
