package com.google.firebase.auth.internal;

import com.google.firebase.auth.SignInMethodQueryResult;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzao implements SignInMethodQueryResult {
    private final List<String> zza;

    @Override // com.google.firebase.auth.SignInMethodQueryResult
    public final List<String> getSignInMethods() {
        return this.zza;
    }

    public zzao(List<String> list) {
        this.zza = list;
    }
}
