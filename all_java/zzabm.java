package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzabm {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzabm(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.zza = j2;
        this.zzb = j3;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzc = j8;
        this.zzh = zzf(j3, 0L, j5, j6, j7, j8);
    }

    protected static long zzf(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
        return Math.max(j5, Math.min(((j5 + j8) - j7) - (j8 / 20), j6 - 1));
    }

    static /* bridge */ /* synthetic */ void zzg(zzabm zzabmVar, long j2, long j3) {
        zzabmVar.zze = j2;
        zzabmVar.zzg = j3;
        zzabmVar.zzi();
    }

    static /* bridge */ /* synthetic */ void zzh(zzabm zzabmVar, long j2, long j3) {
        zzabmVar.zzd = j2;
        zzabmVar.zzf = j3;
        zzabmVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
