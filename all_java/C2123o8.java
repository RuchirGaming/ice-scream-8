package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2123o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27724b;

    public C2123o8(String str, String str2) {
        this.f27723a = str;
        this.f27724b = str2;
    }

    public String toString() {
        return "RuntimeConfig{errorEnvironment='" + this.f27723a + "', handlerVersion='" + this.f27724b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
