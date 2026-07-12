package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
@Deprecated
public interface OfferwallListener {
    @Deprecated
    void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    @Deprecated
    boolean onOfferwallAdCredited(int i2, int i3, boolean z);

    @Deprecated
    void onOfferwallAvailable(boolean z);

    @Deprecated
    void onOfferwallClosed();

    @Deprecated
    void onOfferwallOpened();

    @Deprecated
    void onOfferwallShowFailed(IronSourceError ironSourceError);
}
