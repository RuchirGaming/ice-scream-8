package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzxu {
    private final BigInteger zza;

    public static zzxu zza(BigInteger bigInteger, zzcn zzcnVar) {
        Objects.requireNonNull(zzcnVar, "SecretKeyAccess required");
        return new zzxu(bigInteger);
    }

    public final BigInteger zza(zzcn zzcnVar) {
        Objects.requireNonNull(zzcnVar, "SecretKeyAccess required");
        return this.zza;
    }

    private zzxu(BigInteger bigInteger) {
        this.zza = bigInteger;
    }
}
