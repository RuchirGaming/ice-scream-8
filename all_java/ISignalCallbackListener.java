package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface ISignalCallbackListener<T> {
    void onFailure(String str);

    void onSuccess(String str, String str2, T t);
}
