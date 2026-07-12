package com.yandex.metrica.impl.ob;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Nc> f24765c;

    public Ed(long j2, boolean z, List<Nc> list) {
        this.f24763a = j2;
        this.f24764b = z;
        this.f24765c = list;
    }

    public String toString() {
        return "WakeupConfig{collectionDuration=" + this.f24763a + ", aggressiveRelaunch=" + this.f24764b + ", collectionIntervalRanges=" + this.f24765c + AbstractJsonLexerKt.END_OBJ;
    }
}
