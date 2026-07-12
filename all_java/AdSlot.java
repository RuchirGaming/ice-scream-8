package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.component.video.api.f.b;
import com.bytedance.sdk.component.utils.l;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private Map<String, Object> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f4475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f4478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f4480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f4481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f4485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f4486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f4487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f4488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f4489s;
    private int t;
    private int u;
    private int v;
    private int w;
    private JSONArray x;
    private Bundle y;
    private String z;

    public static int getPosition(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return (i2 == 3 || i2 == 4 || i2 == 7 || i2 == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.f4483m = true;
        this.f4484n = false;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void setUserData(String str) {
        this.f4489s = str;
    }

    public String getUserData() {
        return this.f4489s;
    }

    public String getCodeId() {
        return this.f4471a;
    }

    public boolean isAutoPlay() {
        return this.f4483m;
    }

    public boolean isExpressAd() {
        return this.f4484n;
    }

    public String getBidAdm() {
        return this.f4485o;
    }

    public int getImgAcceptedWidth() {
        return this.f4472b;
    }

    public int getImgAcceptedHeight() {
        return this.f4473c;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f4474d;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f4475e;
    }

    public boolean isSupportDeepLink() {
        return this.f4477g;
    }

    public int getAdCount() {
        return this.f4476f;
    }

    public void setAdCount(int i2) {
        this.f4476f = i2;
    }

    @Deprecated
    public String getRewardName() {
        return this.f4478h;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f4479i;
    }

    public String getMediaExtra() {
        return this.f4480j;
    }

    public String getUserID() {
        return this.f4481k;
    }

    public int getNativeAdType() {
        return this.f4482l;
    }

    public void setNativeAdType(int i2) {
        this.f4482l = i2;
    }

    public String getAdId() {
        return this.f4486p;
    }

    public String getCreativeId() {
        return this.f4487q;
    }

    public String getExt() {
        return this.f4488r;
    }

    public int getIsRotateBanner() {
        return this.t;
    }

    public void setIsRotateBanner(int i2) {
        this.t = i2;
    }

    public int getRotateTime() {
        return this.u;
    }

    public void setRotateTime(int i2) {
        this.u = i2;
    }

    public int getRotateOrder() {
        return this.v;
    }

    public void setRotateOrder(int i2) {
        this.v = i2;
    }

    public void setDurationSlotType(int i2) {
        this.w = i2;
    }

    public int getDurationSlotType() {
        return this.w;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.A;
    }

    public JSONArray getBiddingTokens() {
        return this.x;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.x = jSONArray;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.y;
    }

    public String getLinkId() {
        return this.z;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f4471a);
            jSONObject.put("mAdCount", this.f4476f);
            jSONObject.put("mIsAutoPlay", this.f4483m);
            jSONObject.put("mImgAcceptedWidth", this.f4472b);
            jSONObject.put("mImgAcceptedHeight", this.f4473c);
            jSONObject.put("mExpressViewAcceptedWidth", this.f4474d);
            jSONObject.put("mExpressViewAcceptedHeight", this.f4475e);
            jSONObject.put("mSupportDeepLink", this.f4477g);
            jSONObject.put("mRewardName", this.f4478h);
            jSONObject.put("mRewardAmount", this.f4479i);
            jSONObject.put("mMediaExtra", this.f4480j);
            jSONObject.put("mUserID", this.f4481k);
            jSONObject.put("mNativeAdType", this.f4482l);
            jSONObject.put("mIsExpressAd", this.f4484n);
            jSONObject.put("mAdId", this.f4486p);
            jSONObject.put("mCreativeId", this.f4487q);
            jSONObject.put("mExt", this.f4488r);
            jSONObject.put("mBidAdm", this.f4485o);
            jSONObject.put("mUserData", this.f4489s);
            jSONObject.put("mDurationSlotType", this.w);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", DtbConstants.DEFAULT_PLAYER_WIDTH);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4490a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f4497h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f4499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f4500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f4501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f4502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f4503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f4504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f4505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f4506q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f4507r;
        private Bundle u;
        private String v;
        private int w;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4491b = 640;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4492c = DtbConstants.DEFAULT_PLAYER_WIDTH;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f4493d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4494e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f4495f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f4496g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f4498i = "defaultUser";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f4508s = true;
        private Map<String, Object> t = null;

        @Deprecated
        public Builder setRewardAmount(int i2) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.f4504o = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f4505p = str;
            return this;
        }

        public Builder setExt(String str) {
            this.f4506q = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.f4508s = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f4490a = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.f4502m = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i2, int i3) {
            this.f4491b = i2;
            this.f4492c = i3;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f2, float f3) {
            this.f4500k = f2;
            this.f4501l = f3;
            return this;
        }

        public Builder setDurationSlotType(int i2) {
            this.w = i2;
            return this;
        }

        public Builder setAdCount(int i2) {
            if (i2 <= 0) {
                i2 = 1;
                l.c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i2 > 20) {
                l.c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i2 = 20;
            }
            this.f4494e = i2;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f4497h = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f4498i = str;
            return this;
        }

        public Builder setNativeAdType(int i2) {
            this.f4499j = i2;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (l.d()) {
                l.c("bidding", "AdSlot -> bidAdm=" + b.a(str));
            }
            this.f4503n = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f4507r = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.t = map;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.u = bundle;
            return this;
        }

        public Builder setLinkId(String str) {
            this.v = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.f4471a = this.f4490a;
            adSlot.f4476f = this.f4494e;
            adSlot.f4477g = true;
            adSlot.f4472b = this.f4491b;
            adSlot.f4473c = this.f4492c;
            float f2 = this.f4500k;
            if (f2 <= 0.0f) {
                adSlot.f4474d = this.f4491b;
                adSlot.f4475e = this.f4492c;
            } else {
                adSlot.f4474d = f2;
                adSlot.f4475e = this.f4501l;
            }
            adSlot.f4478h = "";
            adSlot.f4479i = 0;
            adSlot.f4480j = this.f4497h;
            adSlot.f4481k = this.f4498i;
            adSlot.f4482l = this.f4499j;
            adSlot.f4483m = this.f4508s;
            adSlot.f4484n = this.f4502m;
            adSlot.f4485o = this.f4503n;
            adSlot.f4486p = this.f4504o;
            adSlot.f4487q = this.f4505p;
            adSlot.f4488r = this.f4506q;
            adSlot.f4489s = this.f4507r;
            adSlot.A = this.t;
            Bundle bundle = this.u;
            if (bundle == null) {
                bundle = new Bundle();
            }
            adSlot.y = bundle;
            adSlot.z = this.v;
            adSlot.w = this.w;
            return adSlot;
        }
    }
}
