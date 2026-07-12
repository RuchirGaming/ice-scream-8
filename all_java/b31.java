package com.yandex.mobile.ads.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class b31 {
    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "LOW";
        }
        if (i2 == 2) {
            return "NORMAL";
        }
        if (i2 == 3) {
            return "HIGH";
        }
        return i2 == 4 ? "IMMEDIATE" : AbstractJsonLexerKt.NULL;
    }
}
