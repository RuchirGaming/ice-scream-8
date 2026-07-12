package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f16590q = "customNetwork";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f16591r = "customNetworkPackage";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f16592s = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f16595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f16596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f16597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f16598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f16599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f16600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f16601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f16602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f16603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f16608p;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f16593a = networkSettings.getProviderName();
        this.f16603k = networkSettings.getProviderName();
        this.f16594b = networkSettings.getProviderTypeForReflection();
        this.f16596d = networkSettings.getRewardedVideoSettings();
        this.f16597e = networkSettings.getInterstitialSettings();
        this.f16598f = networkSettings.getBannerSettings();
        this.f16599g = networkSettings.getNativeAdSettings();
        this.f16595c = networkSettings.getApplicationSettings();
        this.f16604l = networkSettings.getRewardedVideoPriority();
        this.f16605m = networkSettings.getInterstitialPriority();
        this.f16606n = networkSettings.getBannerPriority();
        this.f16607o = networkSettings.getNativeAdPriority();
        this.f16608p = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f16593a = str;
        this.f16603k = str;
        this.f16594b = str;
        this.f16608p = str;
        this.f16596d = new JSONObject();
        this.f16597e = new JSONObject();
        this.f16598f = new JSONObject();
        this.f16599g = new JSONObject();
        this.f16595c = new JSONObject();
        this.f16604l = -1;
        this.f16605m = -1;
        this.f16606n = -1;
        this.f16607o = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f16593a = str;
        this.f16603k = str;
        this.f16594b = str2;
        this.f16608p = str3;
        this.f16596d = jSONObject2;
        this.f16597e = jSONObject3;
        this.f16598f = jSONObject4;
        this.f16599g = jSONObject5;
        this.f16595c = jSONObject;
        this.f16604l = -1;
        this.f16605m = -1;
        this.f16606n = -1;
        this.f16607o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f16601i;
    }

    public JSONObject getApplicationSettings() {
        return this.f16595c;
    }

    public int getBannerPriority() {
        return this.f16606n;
    }

    public JSONObject getBannerSettings() {
        return this.f16598f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f16595c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f16595c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f16596d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f16597e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f16598f) != null)))) {
            return jSONObject2.optString(f16592s);
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.f16599g) == null) {
            return null;
        }
        return jSONObject.optString(f16592s);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f16595c;
        return jSONObject != null ? jSONObject.optString(f16591r, "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 1;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f16605m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f16597e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 99;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f16607o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f16599g;
    }

    public String getProviderDefaultInstance() {
        return this.f16608p;
    }

    public String getProviderInstanceName() {
        return this.f16603k;
    }

    public String getProviderName() {
        return this.f16593a;
    }

    public String getProviderTypeForReflection() {
        return this.f16594b;
    }

    public int getRewardedVideoPriority() {
        return this.f16604l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f16596d;
    }

    public String getSubProviderId() {
        return this.f16600h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f16602j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f16601i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f16595c = jSONObject;
    }

    public void setBannerPriority(int i2) {
        this.f16606n = i2;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f16598f.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f16598f = jSONObject;
    }

    public void setInterstitialPriority(int i2) {
        this.f16605m = i2;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f16597e.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f16597e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f16602j = z;
    }

    public void setNativeAdPriority(int i2) {
        this.f16607o = i2;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f16599g.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f16599g = jSONObject;
    }

    public void setRewardedVideoPriority(int i2) {
        this.f16604l = i2;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f16596d.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f16596d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f16600h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f16595c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }
}
