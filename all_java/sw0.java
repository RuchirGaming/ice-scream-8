package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class sw0 implements tw0 {
    @Override // com.yandex.mobile.ads.impl.tw0
    public final Map<String, Object> a(long j2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        return map;
    }
}
