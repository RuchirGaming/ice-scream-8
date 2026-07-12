package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzalk {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzalk(int i2, int i3, int i4) {
        String str;
        if (i2 != Integer.MIN_VALUE) {
            str = i2 + "/";
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i2 = this.zzd;
        int i3 = i2 == Integer.MIN_VALUE ? this.zzb : i2 + this.zzc;
        this.zzd = i3;
        this.zze = this.zza + i3;
    }
}
