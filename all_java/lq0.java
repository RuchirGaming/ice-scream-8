package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class lq0 {
    public static boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
