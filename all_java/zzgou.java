package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgou {
    private final zzgcr zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzgou(zzgcr zzgcrVar, int i2, String str, String str2, zzgot zzgotVar) {
        this.zza = zzgcrVar;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgou)) {
            return false;
        }
        zzgou zzgouVar = (zzgou) obj;
        return this.zza == zzgouVar.zza && this.zzb == zzgouVar.zzb && this.zzc.equals(zzgouVar.zzc) && this.zzd.equals(zzgouVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
