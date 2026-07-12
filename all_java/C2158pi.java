package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2158pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27867d;

    public C2158pi(long j2, long j3, long j4, long j5) {
        this.f27864a = j2;
        this.f27865b = j3;
        this.f27866c = j4;
        this.f27867d = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2158pi.class != obj.getClass()) {
            return false;
        }
        C2158pi c2158pi = (C2158pi) obj;
        return this.f27864a == c2158pi.f27864a && this.f27865b == c2158pi.f27865b && this.f27866c == c2158pi.f27866c && this.f27867d == c2158pi.f27867d;
    }

    public int hashCode() {
        long j2 = this.f27864a;
        long j3 = this.f27865b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f27866c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f27867d;
        return i3 + ((int) ((j5 >>> 32) ^ j5));
    }

    public String toString() {
        return "CacheControl{cellsAroundTtl=" + this.f27864a + ", wifiNetworksTtl=" + this.f27865b + ", lastKnownLocationTtl=" + this.f27866c + ", netInterfacesTtl=" + this.f27867d + AbstractJsonLexerKt.END_OBJ;
    }
}
