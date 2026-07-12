package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {
        private int advertiserTextViewId;
        private int bodyTextViewId;
        private int callToActionButtonId;
        private int iconContentViewId;
        private int iconImageViewId;
        private final int layoutResourceId;
        private final View mainView;
        private int mediaContentFrameLayoutId;
        private int mediaContentViewGroupId;
        private int optionsContentFrameLayoutId;
        private int optionsContentViewGroupId;
        private int starRatingContentViewGroupId;
        private String templateType;
        private int titleTextViewId;

        public Builder(View view) {
            this(-1, view);
        }

        public Builder(int i2) {
            this(i2, null);
        }

        private Builder(int i2, View view) {
            this.titleTextViewId = -1;
            this.advertiserTextViewId = -1;
            this.bodyTextViewId = -1;
            this.iconImageViewId = -1;
            this.iconContentViewId = -1;
            this.optionsContentViewGroupId = -1;
            this.optionsContentFrameLayoutId = -1;
            this.starRatingContentViewGroupId = -1;
            this.mediaContentViewGroupId = -1;
            this.mediaContentFrameLayoutId = -1;
            this.callToActionButtonId = -1;
            this.layoutResourceId = i2;
            this.mainView = view;
        }

        public Builder setTitleTextViewId(int i2) {
            this.titleTextViewId = i2;
            return this;
        }

        public Builder setAdvertiserTextViewId(int i2) {
            this.advertiserTextViewId = i2;
            return this;
        }

        public Builder setBodyTextViewId(int i2) {
            this.bodyTextViewId = i2;
            return this;
        }

        public Builder setIconImageViewId(int i2) {
            this.iconImageViewId = i2;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(int i2) {
            this.iconContentViewId = i2;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i2) {
            this.optionsContentViewGroupId = i2;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(int i2) {
            this.optionsContentFrameLayoutId = i2;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i2) {
            this.starRatingContentViewGroupId = i2;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i2) {
            this.mediaContentViewGroupId = i2;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(int i2) {
            this.mediaContentFrameLayoutId = i2;
            return this;
        }

        public Builder setCallToActionButtonId(int i2) {
            this.callToActionButtonId = i2;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.templateType = str;
            return this;
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.mainView, this.layoutResourceId, this.titleTextViewId, this.advertiserTextViewId, this.bodyTextViewId, this.iconImageViewId, this.iconContentViewId, this.starRatingContentViewGroupId, this.optionsContentViewGroupId, this.optionsContentFrameLayoutId, this.mediaContentViewGroupId, this.mediaContentFrameLayoutId, this.callToActionButtonId, this.templateType);
        }
    }

    private MaxNativeAdViewBinder(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str) {
        this.mainView = view;
        this.layoutResourceId = i2;
        this.titleTextViewId = i3;
        this.advertiserTextViewId = i4;
        this.bodyTextViewId = i5;
        this.iconImageViewId = i6;
        this.iconContentViewId = i7;
        this.starRatingContentViewGroupId = i8;
        this.optionsContentViewGroupId = i9;
        this.optionsContentFrameLayoutId = i10;
        this.mediaContentViewGroupId = i11;
        this.mediaContentFrameLayoutId = i12;
        this.callToActionButtonId = i13;
        this.templateType = str;
    }
}
