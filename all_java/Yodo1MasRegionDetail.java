package com.yodo1.mas.helper.model;

import android.text.TextUtils;
import com.ironsource.sdk.constants.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasRegionDetail {
    public String ccpaRegion;
    public String cityCode;
    public String cityName;
    public String countryCode;
    public String countryName;
    public int errorCoce;
    public String errorMessage;
    public String gdprRgion;
    public String result;

    public enum RegionRequestResult {
        SUCCESS("success"),
        FAIL(a.f.f17706e);

        public final String name;

        RegionRequestResult(String name) {
            this.name = name;
        }
    }

    public Yodo1MasRegionDetail parseFromJson(String json) {
        try {
            JSONObject jSONObject = new JSONObject(json);
            if (jSONObject.has("result")) {
                this.result = jSONObject.getString("result");
            }
            if (jSONObject.has("countryCode")) {
                this.countryCode = jSONObject.getString("countryCode");
            }
            if (jSONObject.has("countryName")) {
                this.countryName = jSONObject.getString("countryName");
            }
            if (jSONObject.has("cityCode")) {
                this.cityCode = jSONObject.getString("cityCode");
            }
            if (jSONObject.has("cityName")) {
                this.cityName = jSONObject.getString("cityName");
            }
            if (jSONObject.has("gdprRgion")) {
                this.gdprRgion = jSONObject.getString("gdprRgion");
            }
            if (jSONObject.has("ccpaRegion")) {
                this.ccpaRegion = jSONObject.getString("ccpaRegion");
            }
            if (jSONObject.has("errorCoce")) {
                this.errorCoce = jSONObject.getInt("errorCoce");
            }
            if (jSONObject.has("errorMessage")) {
                this.errorMessage = jSONObject.getString("errorMessage");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return this;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.result)) {
                jSONObject.put("result", this.result);
            }
            if (!TextUtils.isEmpty(this.countryCode)) {
                jSONObject.put("countryCode", this.countryCode);
            }
            if (!TextUtils.isEmpty(this.countryName)) {
                jSONObject.put("countryName", this.countryName);
            }
            if (!TextUtils.isEmpty(this.cityCode)) {
                jSONObject.put("cityCode", this.cityCode);
            }
            if (!TextUtils.isEmpty(this.cityName)) {
                jSONObject.put("cityName", this.cityName);
            }
            if (!TextUtils.isEmpty(this.gdprRgion)) {
                jSONObject.put("gdprRgion", this.gdprRgion);
            }
            if (!TextUtils.isEmpty(this.ccpaRegion)) {
                jSONObject.put("ccpaRegion", this.ccpaRegion);
            }
            int i2 = this.errorCoce;
            if (i2 != 0) {
                jSONObject.put("errorCoce", i2);
            }
            if (!TextUtils.isEmpty(this.errorMessage)) {
                jSONObject.put("errorMessage", this.errorMessage);
            }
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
