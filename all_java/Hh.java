package com.yandex.metrica.impl.ob;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f25001b;

    public Hh(String str, List<String> list) {
        this.f25000a = str;
        this.f25001b = list;
    }

    public String toString() {
        return "SdkItem{name='" + this.f25000a + "', classes=" + this.f25001b + AbstractJsonLexerKt.END_OBJ;
    }
}
