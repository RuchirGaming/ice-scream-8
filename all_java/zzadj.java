package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzadj {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzadj(int i2, byte[] bArr, int i3, int i4) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadj zzadjVar = (zzadj) obj;
            if (this.zza == zzadjVar.zza && this.zzc == zzadjVar.zzc && this.zzd == zzadjVar.zzd && Arrays.equals(this.zzb, zzadjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
