package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzhdo implements zzhec, zzhdj {
    private static final Object zza = new Object();
    private volatile zzhec zzb;
    private volatile Object zzc = zza;

    private zzhdo(zzhec zzhecVar) {
        this.zzb = zzhecVar;
    }

    public static zzhdj zza(zzhec zzhecVar) {
        if (zzhecVar instanceof zzhdj) {
            return (zzhdj) zzhecVar;
        }
        Objects.requireNonNull(zzhecVar);
        return new zzhdo(zzhecVar);
    }

    public static zzhec zzc(zzhec zzhecVar) {
        return zzhecVar instanceof zzhdo ? zzhecVar : new zzhdo(zzhecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final Object zzb() {
        Object objZzb = this.zzc;
        Object obj = zza;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.zzc;
                if (objZzb == obj) {
                    objZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZzb;
                    this.zzb = null;
                }
            }
        }
        return objZzb;
    }
}
