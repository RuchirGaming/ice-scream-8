package com.android.billingclient.api;

import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
@Deprecated
public class PriceChangeFlowParams {
    private SkuDetails skuDetails;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
    @Deprecated
    public static class Builder {
        private SkuDetails skuDetails;

        private Builder setSkuDetails(String str) {
            try {
                this.skuDetails = new SkuDetails(str);
                return this;
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Incorrect skuDetails JSON object!", e2);
            }
        }

        public PriceChangeFlowParams build() {
            SkuDetails skuDetails = this.skuDetails;
            if (skuDetails == null) {
                throw new IllegalArgumentException("SkuDetails must be set");
            }
            PriceChangeFlowParams priceChangeFlowParams = new PriceChangeFlowParams();
            priceChangeFlowParams.skuDetails = skuDetails;
            return priceChangeFlowParams;
        }

        public Builder setSkuDetails(SkuDetails skuDetails) {
            this.skuDetails = skuDetails;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SkuDetails getSkuDetails() {
        return this.skuDetails;
    }
}
