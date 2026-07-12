package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f28838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f28839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f28840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f28841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f28842i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f28845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f28846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f28847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f28848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f28849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f28850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f28851i;

        public Builder(String str) {
            this.f28843a = str;
        }

        public AdRequestConfiguration build() {
            return new AdRequestConfiguration(this, 0);
        }

        public Builder setAge(String str) {
            this.f28844b = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f28850h = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f28847e = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f28848f = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f28845c = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f28846d = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f28849g = map;
            return this;
        }

        public Builder setPreferredTheme(AdTheme adTheme) {
            this.f28851i = adTheme;
            return this;
        }
    }

    /* synthetic */ AdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    final String a() {
        return this.f28834a;
    }

    final String b() {
        return this.f28835b;
    }

    final String c() {
        return this.f28841h;
    }

    final String d() {
        return this.f28837d;
    }

    final List<String> e() {
        return this.f28838e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestConfiguration.class != obj.getClass()) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (!this.f28834a.equals(adRequestConfiguration.f28834a)) {
            return false;
        }
        String str = this.f28835b;
        if (str == null ? adRequestConfiguration.f28835b != null : !str.equals(adRequestConfiguration.f28835b)) {
            return false;
        }
        String str2 = this.f28836c;
        if (str2 == null ? adRequestConfiguration.f28836c != null : !str2.equals(adRequestConfiguration.f28836c)) {
            return false;
        }
        String str3 = this.f28837d;
        if (str3 == null ? adRequestConfiguration.f28837d != null : !str3.equals(adRequestConfiguration.f28837d)) {
            return false;
        }
        List<String> list = this.f28838e;
        if (list == null ? adRequestConfiguration.f28838e != null : !list.equals(adRequestConfiguration.f28838e)) {
            return false;
        }
        Location location = this.f28839f;
        if (location == null ? adRequestConfiguration.f28839f != null : !location.equals(adRequestConfiguration.f28839f)) {
            return false;
        }
        Map<String, String> map = this.f28840g;
        if (map == null ? adRequestConfiguration.f28840g != null : !map.equals(adRequestConfiguration.f28840g)) {
            return false;
        }
        String str4 = this.f28841h;
        if (str4 == null ? adRequestConfiguration.f28841h == null : str4.equals(adRequestConfiguration.f28841h)) {
            return this.f28842i == adRequestConfiguration.f28842i;
        }
        return false;
    }

    final String f() {
        return this.f28836c;
    }

    final Location g() {
        return this.f28839f;
    }

    final Map<String, String> h() {
        return this.f28840g;
    }

    public int hashCode() {
        int iHashCode = this.f28834a.hashCode() * 31;
        String str = this.f28835b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28836c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28837d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f28838e;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f28839f;
        int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f28840g;
        int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f28841h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f28842i;
        return iHashCode8 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    final AdTheme i() {
        return this.f28842i;
    }

    private AdRequestConfiguration(Builder builder) {
        this.f28834a = builder.f28843a;
        this.f28835b = builder.f28844b;
        this.f28836c = builder.f28845c;
        this.f28837d = builder.f28847e;
        this.f28838e = builder.f28848f;
        this.f28839f = builder.f28846d;
        this.f28840g = builder.f28849g;
        this.f28841h = builder.f28850h;
        this.f28842i = builder.f28851i;
    }
}
