package com.unity3d.scar.adapter.common;

import com.unity3d.scar.adapter.common.IUnityAdsError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IAdsErrorHandler<T extends IUnityAdsError> {
    void handleError(T t);
}
