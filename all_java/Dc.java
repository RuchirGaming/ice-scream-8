package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24670b;

    public Dc(long j2, long j3) {
        this.f24669a = j2;
        this.f24670b = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dc.class != obj.getClass()) {
            return false;
        }
        Dc dc = (Dc) obj;
        return this.f24669a == dc.f24669a && this.f24670b == dc.f24670b;
    }

    public int hashCode() {
        long j2 = this.f24669a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.f24670b;
        return i2 + ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "ForcedCollectingArguments{durationSeconds=" + this.f24669a + ", intervalSeconds=" + this.f24670b + AbstractJsonLexerKt.END_OBJ;
    }
}
