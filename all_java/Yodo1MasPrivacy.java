package com.yodo1.mas.helper;

import android.text.TextUtils;
import com.yodo1.mas.helper.model.Yodo1MasRegionDetail;
import com.yodo1.mas.utils.Yodo1MasSPUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasPrivacy {
    private static final String KEY_CCPA_DO_NOT_SELL = "YODO1_CCPA_DO_NOT_SELL";
    private static final String KEY_COPPA_AGE_RESTRICTED = "YODO1_COPPA_AGE_RESTRICTED";
    private static final String KEY_GDPR_USER_CONSENT = "YODO1_GDPR_USER_CONSENT";
    private static final String KEY_IS_PERSONALIZED_DISABLED = "YODO1_IS_PERSONALIZED_DISABLED";
    private static Yodo1MasPrivacy instance;
    private Boolean isCCPADoNotSell;
    private Boolean isCOPPAAgeRestricted;
    private Boolean isGDPRUserConsent;
    private Boolean isPersonalizedDisabled;

    public static Yodo1MasPrivacy getInstance() {
        if (instance == null) {
            synchronized (Yodo1MasPrivacy.class) {
                if (instance == null) {
                    instance = new Yodo1MasPrivacy();
                }
            }
        }
        return instance;
    }

    private void checkGDPRUserConsent() {
        if (Yodo1MasSPUtils.getInstance(null).checkWithKey(KEY_GDPR_USER_CONSENT)) {
            this.isGDPRUserConsent = Boolean.valueOf(Yodo1MasSPUtils.getInstance(null).getBoolean(KEY_GDPR_USER_CONSENT, false));
        }
    }

    public boolean getGDPRUserConsent() {
        checkGDPRUserConsent();
        Boolean bool = this.isGDPRUserConsent;
        return bool != null && bool.booleanValue();
    }

    public void setGDPRUserConsent(boolean GDPRUserConsent) {
        this.isGDPRUserConsent = Boolean.valueOf(GDPRUserConsent);
        Yodo1MasSPUtils.getInstance(null).putBoolean(KEY_GDPR_USER_CONSENT, GDPRUserConsent);
    }

    public String getGDPRUserConsentString() {
        checkGDPRUserConsent();
        Boolean bool = this.isGDPRUserConsent;
        return bool == null ? "No value set" : String.valueOf(bool);
    }

    public String getGDPRUserConsentPrintValue() {
        checkGDPRUserConsent();
        if (this.isGDPRUserConsent == null) {
            return " - No value set";
        }
        return ": " + this.isGDPRUserConsent;
    }

    private void checkCOPPAAgeRestricted() {
        if (Yodo1MasSPUtils.getInstance(null).checkWithKey(KEY_COPPA_AGE_RESTRICTED)) {
            this.isCOPPAAgeRestricted = Boolean.valueOf(Yodo1MasSPUtils.getInstance(null).getBoolean(KEY_COPPA_AGE_RESTRICTED, true));
        }
    }

    public boolean getCOPPAAgeRestricted() {
        checkCOPPAAgeRestricted();
        Boolean bool = this.isCOPPAAgeRestricted;
        return bool == null || bool.booleanValue();
    }

    public void setCOPPAAgeRestricted(boolean COPPAAgeRestricted) {
        this.isCOPPAAgeRestricted = Boolean.valueOf(COPPAAgeRestricted);
        Yodo1MasSPUtils.getInstance(null).putBoolean(KEY_COPPA_AGE_RESTRICTED, COPPAAgeRestricted);
    }

    public String getCOPPAAgeRestrictedString() {
        checkCOPPAAgeRestricted();
        Boolean bool = this.isCOPPAAgeRestricted;
        return bool == null ? "No value set" : bool.toString();
    }

    public String getCOPPAAgeRestrictedPrintValue() {
        checkCOPPAAgeRestricted();
        if (this.isCOPPAAgeRestricted == null) {
            return " - No value set";
        }
        return ": " + this.isCOPPAAgeRestricted;
    }

    private void checkCCPADoNotSell() {
        if (Yodo1MasSPUtils.getInstance(null).checkWithKey(KEY_CCPA_DO_NOT_SELL)) {
            this.isCCPADoNotSell = Boolean.valueOf(Yodo1MasSPUtils.getInstance(null).getBoolean(KEY_CCPA_DO_NOT_SELL, true));
        }
    }

    public boolean getCCPADoNotSell() {
        checkCCPADoNotSell();
        Boolean bool = this.isCCPADoNotSell;
        return bool == null || bool.booleanValue();
    }

    public void setCCPADoNotSell(boolean CCPADoNotSell) {
        this.isCCPADoNotSell = Boolean.valueOf(CCPADoNotSell);
        Yodo1MasSPUtils.getInstance(null).putBoolean(KEY_CCPA_DO_NOT_SELL, CCPADoNotSell);
    }

    public String getCCPADoNotSellString() {
        checkCCPADoNotSell();
        Boolean bool = this.isCCPADoNotSell;
        return bool == null ? "No value set" : bool.toString();
    }

    public String getCCPADoNotSellPrintValue() {
        checkCCPADoNotSell();
        if (this.isCCPADoNotSell == null) {
            return " - No value set";
        }
        return ": " + this.isCCPADoNotSell;
    }

    private void checkPersonalizedState() {
        if (Yodo1MasSPUtils.getInstance(null).checkWithKey(KEY_IS_PERSONALIZED_DISABLED)) {
            this.isPersonalizedDisabled = Boolean.valueOf(Yodo1MasSPUtils.getInstance(null).getBoolean(KEY_IS_PERSONALIZED_DISABLED, false));
        }
    }

    public Boolean getPersonalizedState() {
        checkPersonalizedState();
        Boolean bool = this.isPersonalizedDisabled;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public void setPersonalizedState(Boolean disablePersonal) {
        this.isPersonalizedDisabled = disablePersonal;
        Yodo1MasSPUtils.getInstance(null).putBoolean(KEY_IS_PERSONALIZED_DISABLED, disablePersonal.booleanValue());
    }

    public String getPersonalizedStatePrintValue() {
        checkPersonalizedState();
        if (this.isPersonalizedDisabled == null) {
            return " - No value set";
        }
        return ": " + this.isPersonalizedDisabled;
    }

    public void setPrivacyWithAge(int userAge, Yodo1MasRegionDetail regionInfo) {
        if (userAge <= 0) {
            return;
        }
        boolean z = false;
        boolean z2 = userAge < 13;
        boolean z3 = regionInfo == null || !TextUtils.equals("true", regionInfo.gdprRgion) || userAge >= 16;
        if (regionInfo != null && TextUtils.equals("true", regionInfo.ccpaRegion)) {
            z = userAge < 16;
        }
        setCOPPAAgeRestricted(z2);
        setGDPRUserConsent(z3);
        setCCPADoNotSell(z);
    }
}
