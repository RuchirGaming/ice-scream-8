package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25376b;

    public Nc(long j2, long j3) {
        this.f25375a = j2;
        this.f25376b = j3;
    }

    public String toString() {
        return "IntervalRange{minInterval=" + this.f25375a + ", maxInterval=" + this.f25376b + AbstractJsonLexerKt.END_OBJ;
    }
}
