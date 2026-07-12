package io.bidmachine.models;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface DataRestrictions {
    boolean canSendDeviceInfo();

    boolean canSendGeoPosition();

    boolean canSendIfa();

    boolean canSendUserInfo();

    List<Integer> getGPPIds();

    String getGPPString();

    String getIABGDPRString();

    String getUSPrivacyString();

    boolean isUserAgeRestricted();

    boolean isUserGdprProtected();

    boolean isUserHasCcpaConsent();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();
}
