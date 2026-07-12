package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2250tb<R, M extends Fn> implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f28144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f28145b;

    public C2250tb(R r2, M m2) {
        this.f28144a = r2;
        this.f28145b = m2;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f28145b.a();
    }

    public String toString() {
        return "Result{result=" + this.f28144a + ", metaInfo=" + this.f28145b + AbstractJsonLexerKt.END_OBJ;
    }
}
