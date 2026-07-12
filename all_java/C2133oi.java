package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2133oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Pair<String, a>> f27747a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27748a;

        public a(String str) {
            this.f27748a = str;
        }

        public String toString() {
            return this.f27748a;
        }
    }

    public C2133oi(List<Pair<String, a>> list) {
        this.f27747a = list;
    }

    public String toString() {
        return "AttributionConfig{deeplinkConditions=" + this.f27747a + AbstractJsonLexerKt.END_OBJ;
    }
}
