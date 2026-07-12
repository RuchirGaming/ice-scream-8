package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f24190b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f24192b;

        public PreloadInfo build() {
            return new PreloadInfo(this);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f24192b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f24191a = str;
            this.f24192b = new HashMap();
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f24190b;
    }

    public String getTrackingId() {
        return this.f24189a;
    }

    private PreloadInfo(Builder builder) {
        this.f24189a = builder.f24191a;
        this.f24190b = Collections.unmodifiableMap(builder.f24192b);
    }
}
