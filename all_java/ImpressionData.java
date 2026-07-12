package com.fyber.inneractive.sdk.external;

import com.inmobi.commons.core.configs.TelemetryConfig;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f9294a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f9295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f9297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f9302i;

    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f9303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9304b;

        public String getCurrency() {
            return this.f9304b;
        }

        public double getValue() {
            return this.f9303a;
        }

        public void setValue(double d2) {
            this.f9303a = d2;
        }

        public String toString() {
            return "Pricing{value=" + this.f9303a + ", currency='" + this.f9304b + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9306b;

        public Video(boolean z, long j2) {
            this.f9305a = z;
            this.f9306b = j2;
        }

        public long getDuration() {
            return this.f9306b;
        }

        public boolean isSkippable() {
            return this.f9305a;
        }

        public String toString() {
            return "Video{skippable=" + this.f9305a + ", duration=" + this.f9306b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String getAdvertiserDomain() {
        return this.f9302i;
    }

    public String getCampaignId() {
        return this.f9301h;
    }

    public String getCountry() {
        return this.f9298e;
    }

    public String getCreativeId() {
        return this.f9300g;
    }

    public Long getDemandId() {
        return this.f9297d;
    }

    public String getDemandSource() {
        return this.f9296c;
    }

    public String getImpressionId() {
        return this.f9299f;
    }

    public Pricing getPricing() {
        return this.f9294a;
    }

    public Video getVideo() {
        return this.f9295b;
    }

    public void setAdvertiserDomain(String str) {
        this.f9302i = str;
    }

    public void setCampaignId(String str) {
        this.f9301h = str;
    }

    public void setCountry(String str) {
        this.f9298e = str;
    }

    public void setCpmValue(String str) {
        double d2;
        try {
            d2 = Double.parseDouble(str);
        } catch (Exception unused) {
            d2 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        }
        this.f9294a.f9303a = d2;
    }

    public void setCreativeId(String str) {
        this.f9300g = str;
    }

    public void setCurrency(String str) {
        this.f9294a.f9304b = str;
    }

    public void setDemandId(Long l2) {
        this.f9297d = l2;
    }

    public void setDemandSource(String str) {
        this.f9296c = str;
    }

    public void setDuration(long j2) {
        this.f9295b.f9306b = j2;
    }

    public void setImpressionId(String str) {
        this.f9299f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f9294a = pricing;
    }

    public void setVideo(Video video) {
        this.f9295b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f9294a + ", video=" + this.f9295b + ", demandSource='" + this.f9296c + "', country='" + this.f9298e + "', impressionId='" + this.f9299f + "', creativeId='" + this.f9300g + "', campaignId='" + this.f9301h + "', advertiserDomain='" + this.f9302i + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
