package io.bidmachine;

import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface HeaderBiddingCollectParamsCallback {
    void onCollectFail(BMError bMError);

    void onCollectFinished(Map<String, String> map);
}
