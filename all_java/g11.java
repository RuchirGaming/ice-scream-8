package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class g11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final te f30913a = new te();

    public final f11 a(String str) throws JSONException {
        this.f30913a.getClass();
        JSONObject jSONObject = new JSONObject(te.a(str.getBytes()));
        HashMap map = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        return new f11(string, map);
    }
}
