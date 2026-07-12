package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgly {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgly(Class cls, Class cls2, zzglx zzglxVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgly)) {
            return false;
        }
        zzgly zzglyVar = (zzgly) obj;
        return zzglyVar.zza.equals(this.zza) && zzglyVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        Class cls = this.zzb;
        return this.zza.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
