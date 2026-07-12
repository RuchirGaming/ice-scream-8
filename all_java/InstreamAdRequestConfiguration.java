package com.yandex.mobile.ads.instream;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class InstreamAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f37493c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37494a = MBridgeConstans.ENDCARD_URL_TYPE_PL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f37496c;

        public Builder(String str) {
            this.f37495b = str;
        }

        public InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this, 0);
        }

        public Builder setCategoryId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f37494a = str;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f37496c = map;
            return this;
        }
    }

    /* synthetic */ InstreamAdRequestConfiguration(Builder builder, int i2) {
        this(builder);
    }

    public String getCategoryId() {
        return this.f37491a;
    }

    public String getPageId() {
        return this.f37492b;
    }

    public Map<String, String> getParameters() {
        return this.f37493c;
    }

    private InstreamAdRequestConfiguration(Builder builder) {
        this.f37491a = builder.f37494a;
        this.f37492b = builder.f37495b;
        this.f37493c = builder.f37496c;
    }
}
