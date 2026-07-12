package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface IInitializationListener {
    void onSdkInitializationFailed(String str, ErrorState errorState, int i2);

    void onSdkInitialized();
}
