package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class ud1 implements cc<String> {
    ud1() {
    }

    @Override // com.yandex.mobile.ads.impl.cc
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return a2(str);
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public static boolean a2(String str) {
        return !(TextUtils.isEmpty(str) || AbstractJsonLexerKt.NULL.equals(str));
    }
}
