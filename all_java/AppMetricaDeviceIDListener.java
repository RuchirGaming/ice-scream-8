package com.yandex.metrica;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface AppMetricaDeviceIDListener {

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE
    }

    void onError(Reason reason);

    void onLoaded(String str);
}
