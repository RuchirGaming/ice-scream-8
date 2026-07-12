package com.inmobi.media;

import androidx.credentials.webauthn.Cbor$Arg$$ExternalSyntheticBackport0;

/* JADX INFO: compiled from: EventConfig.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15287k;

    public x3(int i2, long j2, long j3, long j4, int i3, int i4, int i5, int i6, long j5, long j6) {
        this.f15277a = i2;
        this.f15278b = j2;
        this.f15279c = j3;
        this.f15280d = j4;
        this.f15281e = i3;
        this.f15282f = i4;
        this.f15283g = i5;
        this.f15284h = i6;
        this.f15285i = j5;
        this.f15286j = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return this.f15277a == x3Var.f15277a && this.f15278b == x3Var.f15278b && this.f15279c == x3Var.f15279c && this.f15280d == x3Var.f15280d && this.f15281e == x3Var.f15281e && this.f15282f == x3Var.f15282f && this.f15283g == x3Var.f15283g && this.f15284h == x3Var.f15284h && this.f15285i == x3Var.f15285i && this.f15286j == x3Var.f15286j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f15277a * 31) + Cbor$Arg$$ExternalSyntheticBackport0.m(this.f15278b)) * 31) + Cbor$Arg$$ExternalSyntheticBackport0.m(this.f15279c)) * 31) + Cbor$Arg$$ExternalSyntheticBackport0.m(this.f15280d)) * 31) + this.f15281e) * 31) + this.f15282f) * 31) + this.f15283g) * 31) + this.f15284h) * 31) + Cbor$Arg$$ExternalSyntheticBackport0.m(this.f15285i)) * 31) + Cbor$Arg$$ExternalSyntheticBackport0.m(this.f15286j);
    }

    public String toString() {
        return "EventConfig(maxRetryCount=" + this.f15277a + ", timeToLiveInSec=" + this.f15278b + ", processingInterval=" + this.f15279c + ", ingestionLatencyInSec=" + this.f15280d + ", minBatchSizeWifi=" + this.f15281e + ", maxBatchSizeWifi=" + this.f15282f + ", minBatchSizeMobile=" + this.f15283g + ", maxBatchSizeMobile=" + this.f15284h + ", retryIntervalWifi=" + this.f15285i + ", retryIntervalMobile=" + this.f15286j + ')';
    }
}
