package com.google.android.gms.ads.initialization;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface AdapterStatus {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
