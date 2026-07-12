package com.google.android.recaptcha.internal;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public abstract class zzfm implements Iterable {
    private final zzfe zza = zzfe.zza();

    protected zzfm() {
    }

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
