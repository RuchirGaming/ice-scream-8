package com.unity.purchasing.common;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class SaneJSONObject extends JSONObject {
    @Override // org.json.JSONObject
    public JSONObject put(String str, double d2) {
        try {
            return super.put(str, d2);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) {
        try {
            return super.put(str, obj);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        try {
            return super.put(str, z);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
