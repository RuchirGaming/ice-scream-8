package com.monetization.ads.mediation.base;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class MediatedAdapterInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23710c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23713c;

        public MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this);
        }

        public Builder setAdapterVersion(String str) {
            this.f23711a = str;
            return this;
        }

        public Builder setNetworkName(String str) {
            this.f23712b = str;
            return this;
        }

        public Builder setNetworkSdkVersion(String str) {
            this.f23713c = str;
            return this;
        }
    }

    public String getAdapterVersion() {
        return this.f23708a;
    }

    public String getNetworkName() {
        return this.f23709b;
    }

    public String getNetworkSdkVersion() {
        return this.f23710c;
    }

    private MediatedAdapterInfo(Builder builder) {
        this.f23708a = builder.f23711a;
        this.f23709b = builder.f23712b;
        this.f23710c = builder.f23713c;
    }
}
