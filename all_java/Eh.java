package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Hh> f24767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24771e;

    public Eh(List<Hh> list, String str, long j2, boolean z, boolean z2) {
        this.f24767a = Collections.unmodifiableList(list);
        this.f24768b = str;
        this.f24769c = j2;
        this.f24770d = z;
        this.f24771e = z2;
    }

    public String toString() {
        return "SdkFingerprintingState{sdkItemList=" + this.f24767a + ", etag='" + this.f24768b + "', lastAttemptTime=" + this.f24769c + ", hasFirstCollectionOccurred=" + this.f24770d + ", shouldRetry=" + this.f24771e + AbstractJsonLexerKt.END_OBJ;
    }
}
