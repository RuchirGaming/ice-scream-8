package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzoy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzoy zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzoy zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzoy zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzpa zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpa(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
