package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1778ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f26517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f26519c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C1778ac(a aVar, String str, Boolean bool) {
        this.f26517a = aVar;
        this.f26518b = str;
        this.f26519c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.f26517a + ", advId='" + this.f26518b + "', limitedAdTracking=" + this.f26519c + AbstractJsonLexerKt.END_OBJ;
    }
}
