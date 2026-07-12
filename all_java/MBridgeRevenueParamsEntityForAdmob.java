package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeRevenueParamsEntityForAdmob extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForAdmob(String str, String str2) {
        super(str, str2);
        setMediationName("Admob");
    }

    public void setAdmobResponseInfo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            setSourceData(str, str);
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("Loaded Adapter Response");
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("Credentials");
                if (jSONObjectOptJSONObject2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject2.get(next) + "");
                    }
                    setNetworkInfo(jSONObject);
                }
                setNetworkName(jSONObjectOptJSONObject.optString("Ad Source Name"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAdmobRevenueInfo(int i2, long j2, String str) {
        setRevenue(j2 + "");
        setPrecision(i2 + "");
        setCurrency(str);
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setAdType(String str) {
        super.setAdType(str);
    }
}
