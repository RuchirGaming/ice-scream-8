package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzuk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzuk(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    private zzuk(Object obj, int i2, int i3, long j2, int i4) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = i4;
    }

    public zzuk(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuk)) {
            return false;
        }
        zzuk zzukVar = (zzuk) obj;
        return this.zza.equals(zzukVar.zza) && this.zzb == zzukVar.zzb && this.zzc == zzukVar.zzc && this.zzd == zzukVar.zzd && this.zze == zzukVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzuk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzuk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzuk(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }
}
