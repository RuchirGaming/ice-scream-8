package com.yodo1.mas.ump.model;

import com.ironsource.sdk.constants.a;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class UmpTrackData {
    public long duration;
    public Boolean isAdmobSDKExist;
    public Boolean isEUCountry;
    public LoadFormResult loadForm;
    public RequestConsentInfoUpdateResult requestConsentInfoUpdate;
    public String sessionId;
    public ShowFormResult showForm;
    public String umpOnLocal;
    public String umpOnServer;
    public String userInteracted;
    public Boolean userPurposeConsents;

    public static class LoadFormResult {
        public String consentStatus;
        public int errorCode;
        public String errorMessage;
        public String result;
    }

    public static class RequestConsentInfoUpdateResult {
        public int errorCode;
        public String errorMessage;
        public boolean isUmpFormAvailable;
        public String result;
    }

    public static class ShowFormResult {
        public String consentStatus;
        public int errorCode;
        public String errorMessage;
        public String result;
    }

    public enum UmpProgressResult {
        SUCCESS("success"),
        FAIL(a.f.f17706e);

        public final String name;

        UmpProgressResult(String name) {
            this.name = name;
        }
    }
}
