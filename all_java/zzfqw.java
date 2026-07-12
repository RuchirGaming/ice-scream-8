package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfqw {
    private final String zza;
    private final long zzb;

    public zzfqw() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzfqw(String str, long j2) {
        this.zza = str;
        this.zzb = j2;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb >= 0;
    }
}
