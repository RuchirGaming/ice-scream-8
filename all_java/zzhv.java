package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzhv {
    private int zza;

    public final void zza(int i2) {
        this.zza = i2 | this.zza;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i2) {
        this.zza = i2;
    }

    protected final boolean zzd(int i2) {
        return (this.zza & i2) == i2;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(536870912);
    }
}
