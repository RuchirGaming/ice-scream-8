package sg.bigo.ads.api;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface AdInteractionListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError(AdError adError);

    void onAdImpression();

    void onAdOpened();
}
