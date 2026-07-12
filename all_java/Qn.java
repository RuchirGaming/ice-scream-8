package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Qn<V, M extends Fn> implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f25646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f25647b;

    public Qn(V v, M m2) {
        this.f25646a = v;
        this.f25647b = m2;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f25647b.a();
    }

    public String toString() {
        return "TrimmingResult{value=" + this.f25646a + ", metaInfo=" + this.f25647b + AbstractJsonLexerKt.END_OBJ;
    }
}
