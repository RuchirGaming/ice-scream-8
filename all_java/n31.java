package com.yandex.mobile.ads.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class n31 {
    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "light";
        }
        if (i2 == 2) {
            return "dark";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i2) {
        if (i2 == 1) {
            return "LIGHT";
        }
        return i2 == 2 ? "DARK" : AbstractJsonLexerKt.NULL;
    }
}
