package io.bidmachine.nativead;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface NativeInteractor {
    void dispatchClick();

    void dispatchFillAd();

    void dispatchImpression();

    boolean dispatchShown();

    void dispatchVideoPlayFinished();
}
