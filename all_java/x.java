package com.applovin.impl.sdk.utils;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class x {
    public static void k(WebView webView) {
        if (webView == null) {
            return;
        }
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }
}
