package com.facebook.ads.redexgen.X;

import com.inmobi.commons.core.configs.TelemetryConfig;
import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2E, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C2E implements Serializable {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;

    public C2E(double d2) {
        this.A04 = d2;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A03;
    }

    public final double A02() {
        return this.A05;
    }

    public final double A03() {
        return this.A06;
    }

    public final double A04() {
        return this.A07;
    }

    public final double A05() {
        if (this.A0A == 0) {
            return TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        }
        return this.A08;
    }

    public final void A06() {
        this.A00 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.A02 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.A03 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.A05 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.A0A = 0;
        this.A07 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        this.A08 = 1.0d;
        this.A09 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
    }

    public final void A07() {
        this.A01 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
    }

    public final void A08(double d2, double d3) {
        this.A0A++;
        double d4 = this.A07 + d2;
        this.A07 = d4;
        this.A02 = d3;
        double d5 = this.A09 + (d3 * d2);
        this.A09 = d5;
        this.A00 = d5 / d4;
        this.A08 = Math.min(this.A08, d3);
        this.A05 = Math.max(this.A05, d3);
        if (d3 >= this.A04) {
            this.A03 += d2;
            double d6 = this.A01 + d2;
            this.A01 = d6;
            this.A06 = Math.max(this.A06, d6);
            return;
        }
        this.A01 = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
    }
}
