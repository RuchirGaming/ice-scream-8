package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25992a;

    public Ui(long j2) {
        this.f25992a = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Ui.class == obj.getClass() && this.f25992a == ((Ui) obj).f25992a;
    }

    public int hashCode() {
        long j2 = this.f25992a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return "StatSending{disabledReportingInterval=" + this.f25992a + AbstractJsonLexerKt.END_OBJ;
    }
}
