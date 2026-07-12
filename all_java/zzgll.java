package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgll {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgll(Class cls, Class cls2, zzglk zzglkVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgll)) {
            return false;
        }
        zzgll zzgllVar = (zzgll) obj;
        return zzgllVar.zza.equals(this.zza) && zzgllVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        Class cls = this.zzb;
        return this.zza.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
