package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface IWebViewBridgeSharedObjectStore<T extends IWebViewSharedObject> {
    T get(String str);

    void remove(String str);

    void set(T t);
}
