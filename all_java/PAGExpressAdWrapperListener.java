package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i2);

    void onRenderFail(View view, String str, int i2);

    void onRenderSuccess(View view, float f2, float f3);
}
