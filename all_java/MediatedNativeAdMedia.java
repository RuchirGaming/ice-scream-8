package com.monetization.ads.mediation.nativeads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class MediatedNativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f23759a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f23760a;

        public Builder(float f2) {
            this.f23760a = f2;
        }

        public MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this);
        }
    }

    public float getAspectRatio() {
        return this.f23759a;
    }

    private MediatedNativeAdMedia(Builder builder) {
        this.f23759a = builder.f23760a;
    }
}
