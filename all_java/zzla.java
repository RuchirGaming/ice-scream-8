package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzla {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzla(zzky zzkyVar, zzkz zzkzVar) {
        this.zza = zzkyVar.zza;
        this.zzb = zzkyVar.zzb;
        this.zzc = zzkyVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzla)) {
            return false;
        }
        zzla zzlaVar = (zzla) obj;
        return this.zza == zzlaVar.zza && this.zzb == zzlaVar.zzb && this.zzc == zzlaVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzky zza() {
        return new zzky(this, null);
    }
}
