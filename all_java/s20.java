package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class s20 {
    public static AdImpressionData a(Map map) {
        String str = (String) map.get(z30.b(9));
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new AdImpressionData(str);
    }
}
