package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f37514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f37515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f37516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f37518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f37519j;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f37522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f37523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f37524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f37525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f37526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f37527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f37528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f37529j = true;

        public Builder(String str) {
            this.f37520a = str;
        }

        public NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this, 0);
        }

        public Builder setAge(String str) {
            this.f37521b = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f37527h = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f37524e = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f37525f = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f37522c = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f37523d = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f37526g = map;
            return this;
        }

        public Builder setPreferredTheme(AdTheme adTheme) {
            this.f37528i = adTheme;
            return this;
        }

        public Builder setShouldLoadImagesAutomatically(boolean z) {
            this.f37529j = z;
            return this;
        }
    }

    /* synthetic */ NativeAdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    final String a() {
        return this.f37510a;
    }

    final String b() {
        return this.f37511b;
    }

    final String c() {
        return this.f37517h;
    }

    final String d() {
        return this.f37513d;
    }

    final List<String> e() {
        return this.f37514e;
    }

    final String f() {
        return this.f37512c;
    }

    final Location g() {
        return this.f37515f;
    }

    final Map<String, String> h() {
        return this.f37516g;
    }

    final AdTheme i() {
        return this.f37518i;
    }

    final boolean j() {
        return this.f37519j;
    }

    private NativeAdRequestConfiguration(Builder builder) {
        this.f37510a = builder.f37520a;
        this.f37511b = builder.f37521b;
        this.f37512c = builder.f37522c;
        this.f37513d = builder.f37524e;
        this.f37514e = builder.f37525f;
        this.f37515f = builder.f37523d;
        this.f37516g = builder.f37526g;
        this.f37517h = builder.f37527h;
        this.f37518i = builder.f37528i;
        this.f37519j = builder.f37529j;
    }
}
