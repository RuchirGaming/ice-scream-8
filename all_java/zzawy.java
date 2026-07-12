package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzawy {
    final long zza;
    final String zzb;
    final int zzc;

    zzawy(long j2, String str, int i2) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzawy)) {
            zzawy zzawyVar = (zzawy) obj;
            if (zzawyVar.zza == this.zza && zzawyVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
