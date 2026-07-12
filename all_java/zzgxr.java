package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgxr {
    zzgxr() {
    }

    public static final boolean zza(Object obj) {
        return !((zzgxq) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgxq zzgxqVarZzb = (zzgxq) obj;
        zzgxq zzgxqVar = (zzgxq) obj2;
        if (!zzgxqVar.isEmpty()) {
            if (!zzgxqVarZzb.zze()) {
                zzgxqVarZzb = zzgxqVarZzb.zzb();
            }
            zzgxqVarZzb.zzd(zzgxqVar);
        }
        return zzgxqVarZzb;
    }
}
