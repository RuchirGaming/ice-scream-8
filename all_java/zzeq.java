package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzeq extends zzcw {
    private final zza zza;

    public final int hashCode() {
        return Objects.hash(zzeq.class, this.zza);
    }

    public final zza zzb() {
        return this.zza;
    }

    public static zzeq zza(zza zzaVar) {
        return new zzeq(zzaVar);
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zza(String str) {
            this.zzd = str;
        }
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    private zzeq(zza zzaVar) {
        this.zza = zzaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzeq) && ((zzeq) obj).zza == this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
