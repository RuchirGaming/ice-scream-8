package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24704d;

    public Di(long j2, long j3, long j4, long j5) {
        this.f24701a = j2;
        this.f24702b = j3;
        this.f24703c = j4;
        this.f24704d = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Di.class != obj.getClass()) {
            return false;
        }
        Di di = (Di) obj;
        return this.f24701a == di.f24701a && this.f24702b == di.f24702b && this.f24703c == di.f24703c && this.f24704d == di.f24704d;
    }

    public int hashCode() {
        long j2 = this.f24701a;
        long j3 = this.f24702b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f24703c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f24704d;
        return i3 + ((int) ((j5 >>> 32) ^ j5));
    }

    public String toString() {
        return "SdkFingerprintingConfig{minCollectingInterval=" + this.f24701a + ", minFirstCollectingDelay=" + this.f24702b + ", minCollectingDelayAfterLaunch=" + this.f24703c + ", minRequestRetryInterval=" + this.f24704d + AbstractJsonLexerKt.END_OBJ;
    }
}
