package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class ApiHelperForO {
    private ApiHelperForO() {
    }

    public static void setSafeBrowsingEnabled(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }

    public static boolean getSafeBrowsingEnabled(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        return webView.getWebViewClient();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static PackageInfo getCurrentWebViewPackage() {
        return WebView.getCurrentWebViewPackage();
    }
}
