package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Hn extends En {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25017b;

    public Hn(int i2, int i3) {
        super(i3);
        this.f25017b = i2;
    }

    @Override // com.yandex.metrica.impl.ob.En
    public String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.f25017b + ", bytesTruncated=" + this.f24808a + AbstractJsonLexerKt.END_OBJ;
    }
}
