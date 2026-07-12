package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qx {
    public static FalseClick a(String str) {
        try {
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new FalseClick(jSONObject.getString("url"), jSONObject.getLong("interval"));
        } catch (JSONException unused) {
            return null;
        }
    }
}
