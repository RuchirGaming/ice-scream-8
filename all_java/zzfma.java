package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfma {
    private final zzfnm zza;
    private final String zzb;
    private final zzflm zzc;
    private final String zzd = "Ad overlay";

    public zzfma(View view, zzflm zzflmVar, String str) {
        this.zza = new zzfnm(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzflmVar;
    }

    public final zzflm zza() {
        return this.zzc;
    }

    public final zzfnm zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
