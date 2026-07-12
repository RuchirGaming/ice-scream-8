package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzely implements com.google.android.gms.ads.internal.zzf {
    private com.google.android.gms.ads.internal.zzf zza;

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        com.google.android.gms.ads.internal.zzf zzfVar = this.zza;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.zzf zzfVar) {
        this.zza = zzfVar;
    }
}
