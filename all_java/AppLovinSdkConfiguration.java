package com.applovin.sdk;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface AppLovinSdkConfiguration {

    @Deprecated
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    ConsentFlowUserGeography getConsentFlowUserGeography();

    String getCountryCode();

    List<String> getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}
