package com.bytedance.sdk.openadsdk;

import com.inmobi.commons.core.configs.TelemetryConfig;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class TTImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f4554d;

    public TTImage(int i2, int i3, String str, double d2) {
        this.f4554d = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.f4551a = i2;
        this.f4552b = i3;
        this.f4553c = str;
        this.f4554d = d2;
    }

    public TTImage(int i2, int i3, String str) {
        this(i2, i3, str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    }

    public int getHeight() {
        return this.f4551a;
    }

    public int getWidth() {
        return this.f4552b;
    }

    public String getImageUrl() {
        return this.f4553c;
    }

    public double getDuration() {
        return this.f4554d;
    }

    public boolean isValid() {
        String str;
        return this.f4551a > 0 && this.f4552b > 0 && (str = this.f4553c) != null && str.length() > 0;
    }
}
