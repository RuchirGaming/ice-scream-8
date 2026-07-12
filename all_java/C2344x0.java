package com.yandex.metrica.impl.ob;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2344x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f28492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28494c;

    public C2344x0(String str, Map<String, String> map, String str2) {
        this.f28493b = str;
        this.f28492a = map;
        this.f28494c = str2;
    }

    public String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f28492a + ", mDeeplink='" + this.f28493b + "', mUnparsedReferrer='" + this.f28494c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
