package com.yandex.metrica.impl.ob;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
@Deprecated
public class C2241t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28121b;

    public C2241t2(Map<String, String> map, boolean z) {
        this.f28120a = map;
        this.f28121b = z;
    }

    public String toString() {
        return "SatelliteClidsInfo{clids=" + this.f28120a + ", checked=" + this.f28121b + AbstractJsonLexerKt.END_OBJ;
    }
}
