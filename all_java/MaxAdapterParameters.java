package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface MaxAdapterParameters {
    String getAdUnitId();

    String getConsentString();

    Bundle getCustomParameters();

    Map<String, Object> getLocalExtraParameters();

    Bundle getServerParameters();

    Boolean hasUserConsent();

    Boolean isAgeRestrictedUser();

    Boolean isDoNotSell();

    boolean isTesting();
}
