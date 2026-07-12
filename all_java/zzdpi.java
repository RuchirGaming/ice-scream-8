package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzdpi implements zzbkd {
    final /* synthetic */ zzdpj zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbkd zzd;

    /* synthetic */ zzdpi(zzdpj zzdpjVar, WeakReference weakReference, String str, zzbkd zzbkdVar, zzdph zzdphVar) {
        this.zza = zzdpjVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
