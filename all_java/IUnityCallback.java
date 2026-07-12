package com.unity.purchasing.common;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IUnityCallback {
    void OnProductsRetrieved(String str);

    void OnPurchaseFailed(String str);

    void OnPurchaseSucceeded(String str, String str2, String str3);

    void OnSetupFailed(String str);
}
