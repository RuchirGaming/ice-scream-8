package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    InvocationHandler createWebView(WebView webView);

    InvocationHandler getDropDataProvider();

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebkitToCompatConverter();

    void setSupportLibraryVersion(String str);
}
