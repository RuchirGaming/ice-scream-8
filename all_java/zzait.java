package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzait {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    zzait(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzait)) {
            return false;
        }
        zzait zzaitVar = (zzait) obj;
        return this.zza == zzaitVar.zza && this.zzb == zzaitVar.zzb;
    }
}
