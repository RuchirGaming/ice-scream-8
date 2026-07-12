package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class En implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24808a;

    public En(int i2) {
        this.f24808a = i2;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f24808a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f24808a + AbstractJsonLexerKt.END_OBJ;
    }

    public static Fn a(Fn... fnArr) {
        int iA = 0;
        for (Fn fn : fnArr) {
            if (fn != null) {
                iA += fn.a();
            }
        }
        return new En(iA);
    }
}
