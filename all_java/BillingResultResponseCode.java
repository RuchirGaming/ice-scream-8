package com.unity3d.services.store.gpbl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum BillingResultResponseCode {
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8);

    private final int _responseCode;

    BillingResultResponseCode(int i2) {
        this._responseCode = i2;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public static BillingResultResponseCode fromResponseCode(int i2) {
        for (BillingResultResponseCode billingResultResponseCode : values()) {
            if (billingResultResponseCode.getResponseCode() == i2) {
                return billingResultResponseCode;
            }
        }
        return null;
    }
}
