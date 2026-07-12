package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class MediatedNativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f23754d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f23757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f23758d;

        public Builder(String str) {
            this.f23757c = str;
        }

        public MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this);
        }

        public Builder setDrawable(Drawable drawable) {
            this.f23758d = drawable;
            return this;
        }

        public Builder setHeight(int i2) {
            this.f23756b = i2;
            return this;
        }

        public Builder setWidth(int i2) {
            this.f23755a = i2;
            return this;
        }
    }

    public Drawable getDrawable() {
        return this.f23754d;
    }

    public int getHeight() {
        return this.f23752b;
    }

    public String getUrl() {
        return this.f23753c;
    }

    public int getWidth() {
        return this.f23751a;
    }

    private MediatedNativeAdImage(Builder builder) {
        this.f23753c = builder.f23757c;
        this.f23751a = builder.f23755a;
        this.f23752b = builder.f23756b;
        this.f23754d = builder.f23758d;
    }
}
