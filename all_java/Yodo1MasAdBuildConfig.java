package com.yodo1.mas.helper.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasAdBuildConfig {
    private UMPState enableUserMessageingPlatform;
    private final boolean enableUserPrivacyDialog;
    private final String privacyPolicyUrl;
    private final String storeCode;
    private final String userAgreementUrl;
    private final Yodo1MasUserPrivacyConfig userPrivacyConfig;

    public Yodo1MasAdBuildConfig(Builder builder) {
        this.enableUserMessageingPlatform = UMPState.NOT_SET;
        this.enableUserMessageingPlatform = builder.enableUserMessageingPlatform;
        this.enableUserPrivacyDialog = builder.enableUserPrivacyDialog;
        this.userAgreementUrl = builder.userAgreementUrl;
        this.privacyPolicyUrl = builder.privacyPolicyUrl;
        this.userPrivacyConfig = builder.userPrivacyConfig;
        this.storeCode = builder.storeCode;
    }

    public UMPState isEnableUserMessageingPlatform() {
        return this.enableUserMessageingPlatform;
    }

    public boolean isEnableUserPrivacyDialog() {
        return this.enableUserPrivacyDialog;
    }

    public String getUserAgreementUrl() {
        return this.userAgreementUrl;
    }

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public Yodo1MasUserPrivacyConfig getAgePopBuildConfig() {
        return this.userPrivacyConfig;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public static class Builder {
        private UMPState enableUserMessageingPlatform = UMPState.NOT_SET;
        private boolean enableUserPrivacyDialog;
        private String privacyPolicyUrl;
        private String storeCode;
        private String userAgreementUrl;
        private Yodo1MasUserPrivacyConfig userPrivacyConfig;

        public Builder enableUserMessageingPlatform(UMPState enableUserMessageingPlatform) {
            this.enableUserMessageingPlatform = enableUserMessageingPlatform;
            return this;
        }

        public Builder enableUserPrivacyDialog(boolean enableUserPrivacyDialog) {
            this.enableUserPrivacyDialog = enableUserPrivacyDialog;
            return this;
        }

        public Builder userAgreementUrl(String userAgreementUrl) {
            this.userAgreementUrl = userAgreementUrl;
            return this;
        }

        public Builder privacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }

        public Builder userPrivacyConfig(Yodo1MasUserPrivacyConfig agePopBuildConfig) {
            this.userPrivacyConfig = agePopBuildConfig;
            return this;
        }

        public Builder storeCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }

        public Yodo1MasAdBuildConfig build() {
            return new Yodo1MasAdBuildConfig(this);
        }
    }

    public enum UMPState {
        DISABLE(0, "false"),
        ENABLE(1, "true"),
        NOT_SET(2, "No value set");

        private final int id;
        private final String value;

        UMPState(int id, String value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return this.id;
        }

        public String getValue() {
            return this.value;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + ": {enableUserPrivacyDialog:" + this.enableUserPrivacyDialog + ", userAgreementUrl:" + this.userAgreementUrl + ", privacyPolicyUrl:" + this.privacyPolicyUrl + ", enableUserMessageingPlatform:" + this.enableUserMessageingPlatform + "}";
    }
}
