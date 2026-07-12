package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class InAppMessageResult {
    private final String mPurchaseToken;
    private final int mResponseCode;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i2, String str) {
        this.mResponseCode = i2;
        this.mPurchaseToken = str;
    }

    public String getPurchaseToken() {
        return this.mPurchaseToken;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }
}
