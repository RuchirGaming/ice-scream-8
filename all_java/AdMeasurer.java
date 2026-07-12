package com.explorestack.iab.measurer;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AdMeasurer<AdView extends View> extends Serializable {
    void onAdViewReady(AdView adview);

    void registerAdContainer(ViewGroup viewGroup);

    void registerAdView(AdView adview);
}
