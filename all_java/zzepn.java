package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzepn {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzepm zzb;

    final zzepm zza() {
        return this.zzb;
    }

    final void zzb(zzepm zzepmVar) {
        this.zzb = zzepmVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
