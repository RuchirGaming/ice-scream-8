package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzatr implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzats zza;

    zzatr(zzats zzatsVar) {
        this.zza = zzatsVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i2, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzats zzatsVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzatsVar.zzc > 0) {
            zzats zzatsVar2 = this.zza;
            if (jCurrentTimeMillis >= zzatsVar2.zzc) {
                zzatsVar2.zzd = jCurrentTimeMillis - zzatsVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
