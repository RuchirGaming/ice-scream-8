package com.applovin.sdk;

import com.google.logging.type.LogSeverity;
import com.ironsource.mediationsdk.t;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;
    private final int dE;
    private final String dp;
    private final int height;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, t.f16999a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(LogSeverity.NOTICE_VALUE, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i2, int i3, String str) {
        this.dE = i2;
        this.height = i3;
        this.dp = str;
    }

    public int getWidth() {
        return this.dE;
    }

    public int getHeight() {
        return this.height;
    }

    public String getLabel() {
        return this.dp.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return getLabel();
    }

    public static AppLovinAdSize fromString(String str) {
        if (t.f16999a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }
}
