package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.ironsource.sdk.constants.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeRevenueParamsEntityForMax extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForMax(String str, String str2) {
        super(str, str2);
        setMediationName("Max");
    }

    public void setMaxAdInfo(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("MediatedAd", "").replace(a.i.f17746b, ":").replace(" ", ""));
                setAdType(jSONObject.optString("format"));
                setMediationUnitId(jSONObject.optString("adUnitId"));
                setNetworkName(jSONObject.optString("networkName"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str2.replace("MaxAdWaterfallInfo", "").replace("MaxResponseInfo", "").replace("MaxMediatedNetworkInfo", "").replace("Bundle", "").replace(a.i.f17746b, ":").replace(" ", "")).optJSONArray("networkResponses");
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        if (jSONObject2.optString("adLoadState", "").equals("AD_LOADED")) {
                            setBidType(Boolean.valueOf(jSONObject2.optBoolean("isBidding", false)));
                            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("credentials");
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(0)) != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject3.put(next, jSONObjectOptJSONObject.get(next) + "");
                                }
                                setNetworkInfo(jSONObject3);
                                break;
                            }
                            break;
                            break;
                            break;
                        }
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        setSourceData(str, str2);
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setMaxRevenueInfo(String str, Double d2) {
        setRevenue(d2 + "");
        setPrecision(str + "");
    }
}
