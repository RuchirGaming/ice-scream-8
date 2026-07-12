package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ql implements InterfaceC2061ll {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2061ll
    public JSONObject a(Activity activity, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put(BidResponsedEx.KEY_CID, j2)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
