package com.ironsource.mediationsdk.bidding;

import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface BiddingDataCallback {
    void onFailure(String str);

    void onSuccess(Map<String, Object> map);
}
