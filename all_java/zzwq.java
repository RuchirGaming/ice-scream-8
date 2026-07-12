package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzwq {
    public final long zza;
    public final long zzb;

    public zzwq(long j2, long j3) {
        this.zza = j2;
        this.zzb = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwq)) {
            return false;
        }
        zzwq zzwqVar = (zzwq) obj;
        return this.zza == zzwqVar.zza && this.zzb == zzwqVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
