package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzzo {
    private boolean zzc;
    private int zze;
    private zzzn zza = new zzzn();
    private zzzn zzb = new zzzn();
    private long zzd = C.TIME_UNSET;

    public final float zza() {
        if (this.zza.zzf()) {
            return (float) (1.0E9d / this.zza.zza());
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza.zzf() ? this.zza.zza() : C.TIME_UNSET;
    }

    public final long zzd() {
        return this.zza.zzf() ? this.zza.zzb() : C.TIME_UNSET;
    }

    public final void zze(long j2) {
        this.zza.zzc(j2);
        if (this.zza.zzf()) {
            this.zzc = false;
        } else if (this.zzd != C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(j2);
        }
        if (this.zzc && this.zzb.zzf()) {
            zzzn zzznVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzznVar;
            this.zzc = false;
        }
        this.zzd = j2;
        this.zze = this.zza.zzf() ? 0 : this.zze + 1;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}
