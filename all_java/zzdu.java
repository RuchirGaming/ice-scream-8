package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzdu {
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public static final zzdu zza = new zzdu(0, 0, 0, 1.0f);
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdt
    };

    public zzdu(int i2, int i3, int i4, float f2) {
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdu) {
            zzdu zzduVar = (zzdu) obj;
            if (this.zzc == zzduVar.zzc && this.zzd == zzduVar.zzd && this.zze == zzduVar.zze && this.zzf == zzduVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
